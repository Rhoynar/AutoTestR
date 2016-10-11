	var fileSystem = require('fs');
	var path = require('path');
	var popup = require('./popup1.js');
	var common1 = require('./common1.js');
	var myGenerator = require('./generator1.js');
	var Handlebars = require("handlebars");
	var Promise = require('promise');
	var util = require('util')

	var fName, lName, testName, tName = 'templates/', tDir = 'templates/';

	process.argv.forEach(function (val, index, array) {
	  //console.log(index + ': ' + val);
	  if(index === 2)
		fName = val;
	  else if(index === 3)
		lName = val;
	  else if(index === 4)
		testName = val;
	});


	var sitemap = 0;
	var siteList = [];
	if(fName.search("xml") > -1)
	{
	  xml2js = require('xml2js');
	  var parser = new xml2js.Parser();
	  
	  console.log("Reading xML site map: " + fName);
	  sitemap = 1;
	  var sitemapName = fName.split('/');
	  sitemapName = sitemapName[sitemapName.length - 1];
	  sitemapName = sitemapName.toUpperCase();
	  sitemapName = sitemapName.replace(/-/g,'_');
	  
	  var request = require("request");
	  var fs = require('fs');
	  request({
	  uri: fName,
	}, function(error, response, body) {
	  //fs.writeFileSync(sitemapName, body);
	  
	  /* Parse xML now */
	  
	  parser.parseString(body, function (err, result) {
			//console.log(util.inspect(result, false, null));
			var myData = result['urlset']['url'];

			
			myData.forEach(function (val, index, array){
			siteList.push(val.loc[0]);
			});


			
		});
	   

	var temp = -1;
	var temp1 = -1;

	siteList.forEach(function (fName, index, array){
		
		var testName; 
		
		while((temp != index -1)  || (temp1 != index -1) )
		{
			require('deasync').runLoopOnce();
		}
		
	var fileName = fName.split('/');
	fileName = fileName[fileName.length - 1];
	fileName = fileName.toUpperCase();
	fileName = fileName.replace(/-/g,'_');
	var fileNameHtml = fileName + ".html";
	
	
	console.log("\nGenerating POM, TestCases and TestNG files for ********** " + fileNameHtml+ " ******************\n")

	/*
	var request = require("request");
	var fs = require('fs');
	request({
	  uri: fName,
	}, function(error, response, body) {
	*/

	var request = require("sync-request");
	var res = request('GET', fName);
	  
	  fs.writeFileSync('html/'+fileNameHtml, res.getBody());

		//console.log("HTML file saved as : " + fileNameHtml);
		
	var URLname = fName;
	fName = fileNameHtml



	if(testName === undefined){
	  testName = fName;
	  testName = testName.split('.')[0];
	}

	  if(index == 0 )
	  {
	  tName = tName + lName + '.handlebars';
	  }


	  
	var jsdom = require('jsdom').jsdom;
		var template,page,output;
		var filePath = path.join(__dirname, 'html/' + fName);
		data = fileSystem.readFileSync(filePath, {encoding : 'utf-8'})
			page = data;
			jsdom.env(data, function(err, win) {
			   if(!err){
				var pagePath = filePath;
				common1.URL = pagePath;
				myGenerator.myClass = testName;
				page = myGenerator.startGenerator(win.document, common1, pagePath);
				

	filePath = path.join(__dirname, tName); 
			fileSystem.readFile(filePath,{encoding : 'utf-8'},function(err1, data1){
			  if(!err1){
				  
				  
				template = data1;
				Handlebars.registerHelper('default', function(value, defaultValue) {
				return (value === 0) ? value : (value || defaultValue);
				});
				Handlebars.registerHelper('attributes', function(options) {
		var root = options.data.root;

		if (Handlebars.Utils.isEmpty(root.definitions)) {
			return '';
		}
		else {
			var buffer = [];
			var copies = Array.filter(root.definitions,
				function(item) { return !item.negate; });
			var index = -1;

			copies.sort(function(a, b) {
				return (a.attribute.name > b.attribute.name) ? 1 :
					((b.attribute.name > a.attribute.name) ? -1 : 0); });

			for (var i = 0, j = copies.length; i < j; i++) {
				var copy = copies[i];

				if (root.attributes.indent) {
					copy = Object.extend(copy);
					var delta = root.attributes.longestName -
						copy.attribute.name.length;
					var indent = '';

					if (delta > 0) {
						indent = new Array(delta + 1).join(' ');
					}
					copy.indent = indent;
				}

				// faster array push
				buffer[++index] = options.fn(copy);
			}

			return buffer.join(root.attributes.separator);
		}
	});


	Handlebars.registerHelper('default', function(value, defaultValue) {
		return (value === 0) ? value : (value || defaultValue);
	});

	Handlebars.registerHelper('equals', function(operand1, operand2, options) {
		return (operand1 === operand2) ? options.fn(this) :
			options.inverse(this);
	});

	Handlebars.registerHelper('fill', function(options) {
		var root = options.data.root;

		if (Handlebars.Utils.isEmpty(root.definitions)) {
			return '';
		}
		else {
			var buffer = [];
			var copies = Array.filter(root.definitions, function(item) {
				return '|checkbox|radio|select|text|'.indexOf('|' +
					item.type + '|') > -1 && !item.negate;
			});
			var index = -1;

			copies.sort(function(a, b) {
				return (a.sourceIndex > b.sourceIndex) ? 1 :
					((b.sourceIndex > a.sourceIndex) ? -1 : 0); });

			for (var i = 0, j = copies.length; i < j; i++) {
				// faster array push
				buffer[++index] = options.fn(copies[i]);
			}

			return buffer.join(root.fill.separator);
		}
	});

	Handlebars.registerHelper('lower', function(value) {
		var response = value;
		var type = typeof(value);
		if ('|string|undefined|'.indexOf('|' + type + '|') > -1 || value === null) {
			response = (value || '').toLowerCase();
		}
		return response;
	});

	Handlebars.registerHelper('operations', function(options) {
		var root = options.data.root;

		if (Handlebars.Utils.isEmpty(root.definitions)) {
			return '';
		}
		else {
			var buffer = [];
			var copies = Array.filter(root.definitions,
				function(item) { return !!item.operation.name; });
			var index = -1;
			copies.sort(function(a, b) {
				return (a.operation.name > b.operation.name) ? 1 :
					((b.operation.name > a.operation.name) ? -1 : 0); });

			for (var i = 0, j = copies.length; i < j; i++) {
				// faster array push
				buffer[++index] = options.fn(copies[i]);
			}

			return buffer.join(root.operations.separator);
		}
	});

	Handlebars.registerHelper('proper', function(value) {
		var response = value;
		var type = typeof(value);
		if ('|string|undefined|'.indexOf('|' + type + '|') > -1 || value === null) {
			response = (value || '').replace(/[,.!?-]+/g, ' ').replace(/\s\s+/g, ' ').
				replace(/\w\S*/g, function(word) {
					return word.charAt(0).toUpperCase() + word.substr(1).toLowerCase();
				});
		}
		return response;
	});

	Handlebars.registerHelper('unequals', function(operand1, operand2, options) {
		return (operand1 !== operand2) ? options.fn(this) :
			options.inverse(this);
	});

			

				//console.log(page);
				output = popup.submitClick(tName, lName, page, template, Handlebars);
				//output = page;
				filePath = path.join(__dirname, 'tests/');
			filePath = filePath + testName + '.' + lName;
			fileSystem.writeFile(filePath, output, (err) => {
	  if (err) throw err;

	//modifying the written file
	var finalResult = "";
	


	if(lName === "robot"){

			 var lineReader = require('line-reader');
	   lineReader.eachLine(filePath, function(line, last) {

	  var i = line.indexOf("${.");
	  if(i  > -1) {
		line = line.replace("${.", "${"+testName+".");
		finalResult += line;
		finalResult += "\n";
	}else{
	  finalResult += line;
	  finalResult += "\n";
	}

	if(last){

	fileSystem.writeFile(filePath, finalResult, (err) => {
	  if (err) throw err;

	  console.log('Page Object file: '+testName+"."+lName );
	});

	}
	});

	}
	else{

			var lineReader = require('line-reader');
	   lineReader.eachLine(filePath, function(line, last) {

	var i = line.indexOf("public ");
	  if(i  > -1) {
		  
		if(line.search("public class") > -1)
		{
		line = line.replace("public class", "public class "+testName);
		finalResult += line;
		finalResult += "\n";
			
		}
		else
		{
		line = line.replace("public ", "public "+testName);
		finalResult += line;
		finalResult += "\n";
		}
	}else{
	  finalResult += line;
	  finalResult += "\n";
	}
	if(last){
	fileSystem.writeFile(filePath, finalResult, (err) => {
	  if (err) throw err;
	  console.log('Page Object file: '+testName+"."+lName );

	  //Create TestClass file now 
	var testClass  = fileName + "_TEST";
	var testClassFile = testClass + ".java";

	data = fileSystem.readFileSync(tDir+"testtemplate.txt", {encoding : 'utf-8'});
		data = data.replace("CLASSTests", testClass);
		data = data.replace(/CLASS/g, fileName);
		data = data.replace("URL", URLname);
		

	fs.writeFileSync('tests/'+testClassFile, data);

	//Add fill tests 
	data = fileSystem.readFileSync(filePath, {encoding : 'utf-8'})
	var data1;

		if(data.search("fillAndSubmit()") != -1)
		{
			data1 = fs.readFileSync(tDir+"verifyFillAndSubmitTemplate.txt", {encoding : 'utf-8'});
			fs.appendFileSync('tests/'+testClassFile, data1);
		}
		else if(data.search("fill()") != -1)
		{
			data1 = fs.readFileSync(tDir+"verifyFillTemplate.txt", {encoding : 'utf-8'});
			fs.appendFileSync('tests/'+testClassFile, data1);
		}


	//Now add  links	test 
	var re = /click.*Link\(\)/g;
	while (match = re.exec(data)) {
		data1 = "\n\t@Test \n\tpublic void " + "Test_" + match[0] + "\n" + 
		"\t{ \n\t\tsc." + match[0] + ";" + "\n\t\t/* TEST - ADD Assert Here */\n\t}\n"
		fs.appendFileSync('tests/'+testClassFile, data1);
	}

	//Now close the file 
	fs.appendFileSync('tests/'+testClassFile, "\n\n}");	

		console.log("Test Case File: " + testClassFile);
		
	//Create TestNG file now 
	var testngFileName = fileName + "_TEST" + ".xml";

	data = fileSystem.readFileSync(tDir+"testngtemplate.xml", {encoding : 'utf-8'});
	data = data.replace("CLASSNAME", testClass);
		

	fs.writeFileSync('tests/'+testngFileName, data);
	console.log("TestNG file saved as : " + testngFileName);
	



    temp1 = index;

	  
	  
	  
	  
	  });
	}
	});

	}

	});
	}
	});



			   }
			   
			   temp = index;
			});
	  
	 



		});
		
	});
	}