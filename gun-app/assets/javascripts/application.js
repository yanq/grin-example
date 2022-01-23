// This is a manifest file that'll be compiled into application.js.
//= encoding UTF-8
//= require jquery-3.3.1
//= require bootstrap.bundle
//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
    (function($) {
        $(document).ajaxStart(function() {
            $('#spinner').fadeIn();
        }).ajaxStop(function() {
            $('#spinner').fadeOut();
        });
    })(jQuery);
}
