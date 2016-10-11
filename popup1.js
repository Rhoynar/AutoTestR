MIME_TYPE = 'text/plain';
//var storage;
//window.URL = window.URL || window.webkitURL;

exports.download = function(fileName, content) {
    // revoke previous download path
    //window.URL.revokeObjectURL(element.href);
    //element.download = fileName;
    //element.href = 
    //window.URL.createObjectURL(new Blob([ content ],
      //  { type: MIME_TYPE }));
    //element.dataset.disabled = false;
    //element.dataset.downloadurl = [ MIME_TYPE, fileName, element.href ].join(':');
    //element.click();
};

exports.getElements = function() {
    return {
        button: $('button.generate'),
        downloader: $('a.downloader').get(0),
        model: {
            name: $('[id="model.name"]'),
            target: $('[id="model.target"]')
        },
        target: $('#target')
    };
};

exports.processActivePage = function(input) {
    return $.Deferred(function(defer) {
        chrome.tabs.query({ active: true, currentWindow: true }, function(tabs) {
            chrome.tabs.sendMessage(tabs[0].id, { input: input }, defer.resolve);
        });
    }).promise();
};

exports.validate = function(element) {
    var valid = false;

    if (element) {
        //var parentNode = element.parent().removeClass();

        if (element === '') {
            //parentNode.addClass('error');
            console.log('error element');
        }
        else {
            valid = true;
        }
    }

    return valid;
};

/* $(document).ready(function() {
    // Standard Google Universal Analytics code
    (function(i,s,o,g,r,a,m){i.GoogleAnalyticsObject=r;i[r]=i[r]||function(){
    (i[r].q=i[r].q||[]).push(arguments);},i[r].l=1*new Date();a=s.createElement(o),
    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m);
    })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-325170-7', 'auto');
    // Removes failing protocol check. @see: http://stackoverflow.com/a/22152353/1958200
    ga('set', 'checkProtocolTask', null);
    ga('send', 'pageview', '/popup.html');

    var elements = getElements();
    var notify = elements.button.notify();
    var preloader = $('.preloader').preloader();
    var storage = {};

    elements.target.change(function(e) {
        e.preventDefault();
        ga('send', 'event', 'popup.target', 'change', $(this).val());
    });

    $('button.options').click(function(e) {
        e.preventDefault();
        ga('send', 'event', 'options', 'click');

        if (chrome.runtime.openOptionsPage) {
            chrome.runtime.openOptionsPage(function() {
                if (chrome.runtime.lastError) {
                    // fallback
                    window.open(chrome.runtime.getURL('options.html'));
                }
            });
        }
        else {
            window.open(chrome.runtime.getURL('options.html'));
        }
    });

    $('fieldset.share a').social();

    common.getStorage().always(function(data) {
        storage = data;

        for (var key in storage.targets) {
            elements.target.append('<option value="' + key + '">' +
                storage.targets[key].label + '</option>');
        }

        elements.target.val(storage.target);
        elements.model.name.val(storage.model.name);
        elements.model.target.val(storage.model.target);

        // if it's still empty, let's show the reminder
        validate(elements.model.name);
    });

    chrome.tabs.executeScript(null, {
        file: 'assets/js/generator.js'
    }, function(result) {
        if (!result || chrome.runtime.lastError) {
            notify.error('Unable to access page contents.');
            elements.button.get(0).disabled = true;
            console.log('error.generator', result, chrome.runtime.lastError);
            return;
        }
    });*/

    exports.submitClick = function(name, target, context, template, bar) {
        //e.preventDefault();
        //ga('send', 'event', 'generate', 'click', elements.target.val());
        //preloader.on();

        if (!this.validate(name)) {
            console.log('Page Name is required.');
            //preloader.off();
            return;
        }

        var overrides = {
            model: {
                name: name.replace(/\s+/g, ''),
                target: target
            }
        };

        //storage.target = target;
        //storage.model.name = overrides.model.name;
        //storage.model.target = overrides.model.target;
        //storage.timestamp = new Date().valueOf();

        //chrome.storage.local.set(storage, function() {
            //var target = target;
            //overrides.model.include = target.config.model.include;
            //overrides.model.namespace = target.config.model.namespace;
            //var input = $.extend({}, target.config, overrides);

            //processActivePage(input).always(function(context) {
                //ga('send', 'event', context, 'process', context.url);

                //var generated = (Handlebars.compile(template))(context);
                var generated = (bar.compile(template))(context);

                //console.log(generated);
                var fileName = name + '.' + target;

                //if (context.model.include) {
                    //fileName = context.model.namespace + '.' + fileName;
                //}

                this.download(fileName, 'generated');

                //console.log(fileName + ' is saved.');
                return generated;
                //preloader.off();
            //});
        //});
    };
//});