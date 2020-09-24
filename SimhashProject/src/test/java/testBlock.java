import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

import java.io.*;
import java.math.BigInteger;

public class testBlock {
    public static void main(String[] args) throws Exception {
        String html = "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://github.githubassets.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://avatars0.githubusercontent.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://avatars1.githubusercontent.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://avatars2.githubusercontent.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://avatars3.githubusercontent.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://github-cloud.s3.amazonaws.com\">\n" +
                "  <link rel=\"dns-prefetch\" href=\"https://user-images.githubusercontent.com/\">\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <link crossorigin=\"anonymous\" media=\"all\" integrity=\"sha512-lC+Z9kBc6E9r9umj6DgEEoQP7CX8RgGJGegRUJbthY1Bus2eemD1Kkc1Wbacj7hxeuvVCuyeqfNsKZWxqt1uIw==\" rel=\"stylesheet\" href=\"https://github.githubassets.com/assets/frameworks-942f99f6405ce84f6bf6e9a3e8380412.css\" />\n" +
                "  <link crossorigin=\"anonymous\" media=\"all\" integrity=\"sha512-jbMIzLHRNoZiW7drVC2t2DEM6Cw2GhLM7Q/MLAKYj25kjX1oQN5cz2WxxWUzFmzn+I2PQfA/F9VYmTQ0CLSofg==\" rel=\"stylesheet\" href=\"https://github.githubassets.com/assets/site-8db308ccb1d13686625bb76b542dadd8.css\" />\n" +
                "    <link crossorigin=\"anonymous\" media=\"all\" integrity=\"sha512-/pPccHUYIchnELfXK2NyJXFITJLJHAL3lokSy2rsjIwr+Xe03W5Le4oi6CrwkQ8aD75xdWiKoIrTpPKHUszpUg==\" rel=\"stylesheet\" href=\"https://github.githubassets.com/assets/github-fe93dc70751821c86710b7d72b637225.css\" />\n" +
                "    \n" +
                "    \n" +
                "    \n" +
                "    \n" +
                "\n" +
                "\n" +
                "  <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "  \n" +
                "  <title>111800827/orig_0.8_dis_10.txt at master · qizong007/111800827 · GitHub</title>\n" +
                "    <meta name=\"description\" content=\"This repository is for my personal SE lab. Contribute to qizong007/111800827 development by creating an account on GitHub.\">\n" +
                "    <link rel=\"search\" type=\"application/opensearchdescription+xml\" href=\"/opensearch.xml\" title=\"GitHub\">\n" +
                "  <link rel=\"fluid-icon\" href=\"https://github.com/fluidicon.png\" title=\"GitHub\">\n" +
                "  <meta property=\"fb:app_id\" content=\"1401488693436528\">\n" +
                "  <meta name=\"apple-itunes-app\" content=\"app-id=1477376905\">\n" +
                "\n" +
                "    <meta name=\"twitter:image:src\" content=\"https://avatars0.githubusercontent.com/u/49474835?s=400&amp;v=4\" /><meta name=\"twitter:site\" content=\"@github\" /><meta name=\"twitter:card\" content=\"summary\" /><meta name=\"twitter:title\" content=\"qizong007/111800827\" /><meta name=\"twitter:description\" content=\"This repository is for my personal SE lab. Contribute to qizong007/111800827 development by creating an account on GitHub.\" />\n" +
                "    <meta property=\"og:image\" content=\"https://avatars0.githubusercontent.com/u/49474835?s=400&amp;v=4\" /><meta property=\"og:site_name\" content=\"GitHub\" /><meta property=\"og:type\" content=\"object\" /><meta property=\"og:title\" content=\"qizong007/111800827\" /><meta property=\"og:url\" content=\"https://github.com/qizong007/111800827\" /><meta property=\"og:description\" content=\"This repository is for my personal SE lab. Contribute to qizong007/111800827 development by creating an account on GitHub.\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "  <link rel=\"assets\" href=\"https://github.githubassets.com/\">\n" +
                "  \n" +
                "\n" +
                "  <meta name=\"request-id\" content=\"1B8F:615B:59A828:7B970C:5F614431\" data-pjax-transient=\"true\"/><meta name=\"html-safe-nonce\" content=\"dec539a2175a3c02faff111c9280cbcddab7ad12\" data-pjax-transient=\"true\"/><meta name=\"visitor-payload\" content=\"eyJyZWZlcnJlciI6Imh0dHBzOi8vZ2l0aHViLmNvbS9xaXpvbmcwMDcvMTExODAwODI3L3RyZWUvbWFzdGVyL3Rlc3RzIiwicmVxdWVzdF9pZCI6IjFCOEY6NjE1Qjo1OUE4Mjg6N0I5NzBDOjVGNjE0NDMxIiwidmlzaXRvcl9pZCI6Ijk5NjY4NTY3NTYwODc1MzIwMSIsInJlZ2lvbl9lZGdlIjoiYXAtc291dGhlYXN0LTEiLCJyZWdpb25fcmVuZGVyIjoiYXAtc291dGhlYXN0LTEifQ==\" data-pjax-transient=\"true\"/><meta name=\"visitor-hmac\" content=\"9596a81ab977b3e78615f1a963692661817d108cdc9c1571e9a8eca748630b07\" data-pjax-transient=\"true\"/><meta name=\"cookie-consent-required\" content=\"false\" data-pjax-transient=\"true\"/>\n" +
                "\n" +
                "    <meta name=\"hovercard-subject-tag\" content=\"repository:293548774\" data-pjax-transient>\n" +
                "\n" +
                "\n" +
                "  <meta name=\"github-keyboard-shortcuts\" content=\"repository,source-code\" data-pjax-transient=\"true\" />\n" +
                "\n" +
                "  \n" +
                "\n" +
                "  <meta name=\"selected-link\" value=\"repo_source\" data-pjax-transient>\n" +
                "\n" +
                "    <meta name=\"google-site-verification\" content=\"c1kuD-K2HIVF635lypcsWPoD4kilo5-jA_wBFyT4uMY\">\n" +
                "  <meta name=\"google-site-verification\" content=\"KT5gs8h0wvaagLKAVWq8bbeNwnZZK1r1XQysX3xurLU\">\n" +
                "  <meta name=\"google-site-verification\" content=\"ZzhVyEFwb7w3e0-uOTltm8Jsck2F5StVihD0exw2fsA\">\n" +
                "  <meta name=\"google-site-verification\" content=\"GXs5KoUUkNCoaAZn7wPN-t01Pywp9M3sEjnt_3_ZWPc\">\n" +
                "\n" +
                "  <meta name=\"octolytics-host\" content=\"collector.githubapp.com\" /><meta name=\"octolytics-app-id\" content=\"github\" /><meta name=\"octolytics-event-url\" content=\"https://collector.githubapp.com/github-external/browser_event\" /><meta name=\"octolytics-dimension-ga_id\" content=\"\" class=\"js-octo-ga-id\" />\n" +
                "\n" +
                "  <meta name=\"analytics-location\" content=\"/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show\" data-pjax-transient=\"true\" />\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "    <meta name=\"google-analytics\" content=\"UA-3769691-2\">\n" +
                "\n" +
                "\n" +
                "<meta class=\"js-ga-set\" name=\"dimension10\" content=\"Responsive\" data-pjax-transient>\n" +
                "\n" +
                "<meta class=\"js-ga-set\" name=\"dimension1\" content=\"Logged Out\">\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "      <meta name=\"hostname\" content=\"github.com\">\n" +
                "    <meta name=\"user-login\" content=\"\">\n" +
                "\n" +
                "\n" +
                "      <meta name=\"expected-hostname\" content=\"github.com\">\n" +
                "\n" +
                "\n" +
                "    <meta name=\"enabled-features\" content=\"MARKETPLACE_PENDING_INSTALLATIONS\">\n" +
                "\n" +
                "  <meta http-equiv=\"x-pjax-version\" content=\"6a49488c2bbef9708d8d871bc5e0ff05\">\n" +
                "  \n" +
                "\n" +
                "        <link href=\"https://github.com/qizong007/111800827/commits/master.atom\" rel=\"alternate\" title=\"Recent Commits to 111800827:master\" type=\"application/atom+xml\">\n" +
                "\n" +
                "  <meta name=\"go-import\" content=\"github.com/qizong007/111800827 git https://github.com/qizong007/111800827.git\">\n" +
                "\n" +
                "  <meta name=\"octolytics-dimension-user_id\" content=\"49474835\" /><meta name=\"octolytics-dimension-user_login\" content=\"qizong007\" /><meta name=\"octolytics-dimension-repository_id\" content=\"293548774\" /><meta name=\"octolytics-dimension-repository_nwo\" content=\"qizong007/111800827\" /><meta name=\"octolytics-dimension-repository_public\" content=\"true\" /><meta name=\"octolytics-dimension-repository_is_fork\" content=\"false\" /><meta name=\"octolytics-dimension-repository_network_root_id\" content=\"293548774\" /><meta name=\"octolytics-dimension-repository_network_root_nwo\" content=\"qizong007/111800827\" /><meta name=\"octolytics-dimension-repository_explore_github_marketplace_ci_cta_shown\" content=\"false\" />\n" +
                "\n" +
                "\n" +
                "    <link rel=\"canonical\" href=\"https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt\" data-pjax-transient>\n" +
                "\n" +
                "\n" +
                "  <meta name=\"browser-stats-url\" content=\"https://api.github.com/_private/browser/stats\">\n" +
                "\n" +
                "  <meta name=\"browser-errors-url\" content=\"https://api.github.com/_private/browser/errors\">\n" +
                "\n" +
                "  <link rel=\"mask-icon\" href=\"https://github.githubassets.com/pinned-octocat.svg\" color=\"#000000\">\n" +
                "  <link rel=\"alternate icon\" class=\"js-site-favicon\" type=\"image/png\" href=\"https://github.githubassets.com/favicons/favicon.png\">\n" +
                "  <link rel=\"icon\" class=\"js-site-favicon\" type=\"image/svg+xml\" href=\"https://github.githubassets.com/favicons/favicon.svg\">\n" +
                "\n" +
                "<meta name=\"theme-color\" content=\"#1e2327\">\n" +
                "\n" +
                "\n" +
                "  <link rel=\"manifest\" href=\"/manifest.json\" crossOrigin=\"use-credentials\">\n" +
                "\n" +
                "  </head>\n" +
                "\n" +
                "  <body class=\"logged-out env-production page-responsive page-blob\">\n" +
                "    \n" +
                "\n" +
                "    <div class=\"position-relative js-header-wrapper \">\n" +
                "      <a href=\"#start-of-content\" class=\"px-2 py-4 bg-blue text-white show-on-focus js-skip-to-content\">Skip to content</a>\n" +
                "      <span class=\"progress-pjax-loader width-full js-pjax-loader-bar Progress position-fixed\">\n" +
                "    <span style=\"background-color: #79b8ff;width: 0%;\" class=\"Progress-item progress-pjax-loader-bar \"></span>\n" +
                "</span>      \n" +
                "      \n" +
                "\n" +
                "\n" +
                "\n" +
                "          <header class=\"Header-old header-logged-out js-details-container Details position-relative f4 py-2\" role=\"banner\">\n" +
                "  <div class=\"container-xl d-lg-flex flex-items-center p-responsive\">\n" +
                "    <div class=\"d-flex flex-justify-between flex-items-center\">\n" +
                "        <a class=\"mr-4\" href=\"https://github.com/\" aria-label=\"Homepage\" data-ga-click=\"(Logged out) Header, go to homepage, icon:logo-wordmark\">\n" +
                "          <svg height=\"32\" class=\"octicon octicon-mark-github text-white\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"32\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z\"></path></svg>\n" +
                "        </a>\n" +
                "\n" +
                "          <div class=\"d-lg-none css-truncate css-truncate-target width-fit p-2\">\n" +
                "            \n" +
                "\n" +
                "          </div>\n" +
                "\n" +
                "        <div class=\"d-flex flex-items-center\">\n" +
                "              <a href=\"/join?ref_cta=Sign+up&amp;ref_loc=header+logged+out&amp;ref_page=%2F%3Cuser-name%3E%2F%3Crepo-name%3E%2Fblob%2Fshow&amp;source=header-repo\"\n" +
                "                class=\"d-inline-block d-lg-none f5 text-white no-underline border border-gray-dark rounded-2 px-2 py-1 mr-3 mr-sm-5\"\n" +
                "                data-hydro-click=\"{&quot;event_type&quot;:&quot;authentication.click&quot;,&quot;payload&quot;:{&quot;location_in_page&quot;:&quot;site header&quot;,&quot;repository_id&quot;:null,&quot;auth_type&quot;:&quot;SIGN_UP&quot;,&quot;originating_url&quot;:&quot;https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt&quot;,&quot;user_id&quot;:null}}\" data-hydro-click-hmac=\"1441c3a04f24d040e53b370c1c1bac0d9efebf0391b3886b488b3774ec3750ce\"\n" +
                "                data-ga-click=\"Sign up, click to sign up for account, ref_page:/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show;ref_cta:Sign up;ref_loc:header logged out\">\n" +
                "                Sign&nbsp;up\n" +
                "              </a>\n" +
                "\n" +
                "          <button class=\"btn-link d-lg-none mt-1 js-details-target\" type=\"button\" aria-label=\"Toggle navigation\" aria-expanded=\"false\">\n" +
                "            <svg height=\"24\" class=\"octicon octicon-three-bars text-white\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"24\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M1 2.75A.75.75 0 011.75 2h12.5a.75.75 0 110 1.5H1.75A.75.75 0 011 2.75zm0 5A.75.75 0 011.75 7h12.5a.75.75 0 110 1.5H1.75A.75.75 0 011 7.75zM1.75 12a.75.75 0 100 1.5h12.5a.75.75 0 100-1.5H1.75z\"></path></svg>\n" +
                "          </button>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"HeaderMenu HeaderMenu--logged-out position-fixed top-0 right-0 bottom-0 height-fit position-lg-relative d-lg-flex flex-justify-between flex-items-center flex-auto\">\n" +
                "      <div class=\"d-flex d-lg-none flex-justify-end border-bottom bg-gray-light p-3\">\n" +
                "        <button class=\"btn-link js-details-target\" type=\"button\" aria-label=\"Toggle navigation\" aria-expanded=\"false\">\n" +
                "          <svg height=\"24\" class=\"octicon octicon-x text-gray\" viewBox=\"0 0 24 24\" version=\"1.1\" width=\"24\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M5.72 5.72a.75.75 0 011.06 0L12 10.94l5.22-5.22a.75.75 0 111.06 1.06L13.06 12l5.22 5.22a.75.75 0 11-1.06 1.06L12 13.06l-5.22 5.22a.75.75 0 01-1.06-1.06L10.94 12 5.72 6.78a.75.75 0 010-1.06z\"></path></svg>\n" +
                "        </button>\n" +
                "      </div>\n" +
                "\n" +
                "        <nav class=\"mt-0 px-3 px-lg-0 mb-5 mb-lg-0\" aria-label=\"Global\">\n" +
                "          <ul class=\"d-lg-flex list-style-none\">\n" +
                "              <li class=\"d-block d-lg-flex flex-lg-nowrap flex-lg-items-center border-bottom border-lg-bottom-0 mr-0 mr-lg-3 edge-item-fix position-relative flex-wrap flex-justify-between d-flex flex-items-center \">\n" +
                "                <details class=\"HeaderMenu-details details-overlay details-reset width-full\">\n" +
                "                  <summary class=\"HeaderMenu-summary HeaderMenu-link px-0 py-3 border-0 no-wrap d-block d-lg-inline-block\">\n" +
                "                    Why GitHub?\n" +
                "                    <svg x=\"0px\" y=\"0px\" viewBox=\"0 0 14 8\" xml:space=\"preserve\" fill=\"none\" class=\"icon-chevon-down-mktg position-absolute position-lg-relative\">\n" +
                "                      <path d=\"M1,1l6.2,6L13,1\"></path>\n" +
                "                    </svg>\n" +
                "                  </summary>\n" +
                "                  <div class=\"dropdown-menu flex-auto rounded-1 bg-white px-0 mt-0 pb-4 p-lg-4 position-relative position-lg-absolute left-0 left-lg-n4\">\n" +
                "                    <a href=\"/features\" class=\"py-2 lh-condensed-ultra d-block link-gray-dark no-underline h5 Bump-link--hover\" data-ga-click=\"(Logged out) Header, go to Features\">Features <span class=\"Bump-link-symbol float-right text-normal text-gray-light\">&rarr;</span></a>\n" +
                "                    <ul class=\"list-style-none f5 pb-3\">\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/features/code-review/\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Code review\">Code review</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/features/project-management/\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Project management\">Project management</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/features/integrations\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Integrations\">Integrations</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/features/actions\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Actions\">Actions</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/features/packages\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to GitHub Packages\">Packages</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/features/security\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Security\">Security</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/features#team-management\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Team management\">Team management</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/features#hosting\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Code hosting\">Hosting</a></li>\n" +
                "                      <li class=\"edge-item-fix hide-xl\"><a href=\"/mobile\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Mobile\">Mobile</a></li>\n" +
                "                    </ul>\n" +
                "\n" +
                "                    <ul class=\"list-style-none mb-0 border-lg-top pt-lg-3\">\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/customer-stories\" class=\"py-2 lh-condensed-ultra d-block no-underline link-gray-dark no-underline h5 Bump-link--hover\" data-ga-click=\"(Logged out) Header, go to Customer stories\">Customer stories <span class=\"Bump-link-symbol float-right text-normal text-gray-light\">&rarr;</span></a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/security\" class=\"py-2 lh-condensed-ultra d-block no-underline link-gray-dark no-underline h5 Bump-link--hover\" data-ga-click=\"(Logged out) Header, go to Security\">Security <span class=\"Bump-link-symbol float-right text-normal text-gray-light\">&rarr;</span></a></li>\n" +
                "                    </ul>\n" +
                "                  </div>\n" +
                "                </details>\n" +
                "              </li>\n" +
                "              <li class=\"border-bottom border-lg-bottom-0 mr-0 mr-lg-3\">\n" +
                "                <a href=\"/team\" class=\"HeaderMenu-link no-underline py-3 d-block d-lg-inline-block\" data-ga-click=\"(Logged out) Header, go to Team\">Team</a>\n" +
                "              </li>\n" +
                "              <li class=\"border-bottom border-lg-bottom-0 mr-0 mr-lg-3\">\n" +
                "                <a href=\"/enterprise\" class=\"HeaderMenu-link no-underline py-3 d-block d-lg-inline-block\" data-ga-click=\"(Logged out) Header, go to Enterprise\">Enterprise</a>\n" +
                "              </li>\n" +
                "\n" +
                "              <li class=\"d-block d-lg-flex flex-lg-nowrap flex-lg-items-center border-bottom border-lg-bottom-0 mr-0 mr-lg-3 edge-item-fix position-relative flex-wrap flex-justify-between d-flex flex-items-center \">\n" +
                "                <details class=\"HeaderMenu-details details-overlay details-reset width-full\">\n" +
                "                  <summary class=\"HeaderMenu-summary HeaderMenu-link px-0 py-3 border-0 no-wrap d-block d-lg-inline-block\">\n" +
                "                    Explore\n" +
                "                    <svg x=\"0px\" y=\"0px\" viewBox=\"0 0 14 8\" xml:space=\"preserve\" fill=\"none\" class=\"icon-chevon-down-mktg position-absolute position-lg-relative\">\n" +
                "                      <path d=\"M1,1l6.2,6L13,1\"></path>\n" +
                "                    </svg>\n" +
                "                  </summary>\n" +
                "\n" +
                "                  <div class=\"dropdown-menu flex-auto rounded-1 bg-white px-0 pt-2 pb-0 mt-0 pb-4 p-lg-4 position-relative position-lg-absolute left-0 left-lg-n4\">\n" +
                "                    <ul class=\"list-style-none mb-3\">\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/explore\" class=\"py-2 lh-condensed-ultra d-block link-gray-dark no-underline h5 Bump-link--hover\" data-ga-click=\"(Logged out) Header, go to Explore\">Explore GitHub <span class=\"Bump-link-symbol float-right text-normal text-gray-light\">&rarr;</span></a></li>\n" +
                "                    </ul>\n" +
                "\n" +
                "                    <h4 class=\"text-gray-light text-normal text-mono f5 mb-2 border-lg-top pt-lg-3\">Learn &amp; contribute</h4>\n" +
                "                    <ul class=\"list-style-none mb-3\">\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/topics\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Topics\">Topics</a></li>\n" +
                "                        <li class=\"edge-item-fix\"><a href=\"/collections\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Collections\">Collections</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/trending\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Trending\">Trending</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"https://lab.github.com/\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Learning lab\">Learning Lab</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"https://opensource.guide\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Open source guides\">Open source guides</a></li>\n" +
                "                    </ul>\n" +
                "\n" +
                "                    <h4 class=\"text-gray-light text-normal text-mono f5 mb-2 border-lg-top pt-lg-3\">Connect with others</h4>\n" +
                "                    <ul class=\"list-style-none mb-0\">\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"https://github.com/events\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Events\">Events</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"https://github.community\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Community forum\">Community forum</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"https://education.github.com\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to GitHub Education\">GitHub Education</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"https://stars.github.com\" class=\"py-2 pb-0 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to GitHub Stars Program\">GitHub Stars program</a></li>\n" +
                "                    </ul>\n" +
                "                  </div>\n" +
                "                </details>\n" +
                "              </li>\n" +
                "\n" +
                "              <li class=\"border-bottom border-lg-bottom-0 mr-0 mr-lg-3\">\n" +
                "                <a href=\"/marketplace\" class=\"HeaderMenu-link no-underline py-3 d-block d-lg-inline-block\" data-ga-click=\"(Logged out) Header, go to Marketplace\">Marketplace</a>\n" +
                "              </li>\n" +
                "\n" +
                "              <li class=\"d-block d-lg-flex flex-lg-nowrap flex-lg-items-center border-bottom border-lg-bottom-0 mr-0 mr-lg-3 edge-item-fix position-relative flex-wrap flex-justify-between d-flex flex-items-center \">\n" +
                "                <details class=\"HeaderMenu-details details-overlay details-reset width-full\">\n" +
                "                  <summary class=\"HeaderMenu-summary HeaderMenu-link px-0 py-3 border-0 no-wrap d-block d-lg-inline-block\">\n" +
                "                    Pricing\n" +
                "                    <svg x=\"0px\" y=\"0px\" viewBox=\"0 0 14 8\" xml:space=\"preserve\" fill=\"none\" class=\"icon-chevon-down-mktg position-absolute position-lg-relative\">\n" +
                "                       <path d=\"M1,1l6.2,6L13,1\"></path>\n" +
                "                    </svg>\n" +
                "                  </summary>\n" +
                "\n" +
                "                  <div class=\"dropdown-menu flex-auto rounded-1 bg-white px-0 pt-2 pb-4 mt-0 p-lg-4 position-relative position-lg-absolute left-0 left-lg-n4\">\n" +
                "                    <a href=\"/pricing\" class=\"pb-2 lh-condensed-ultra d-block link-gray-dark no-underline h5 Bump-link--hover\" data-ga-click=\"(Logged out) Header, go to Pricing\">Plans <span class=\"Bump-link-symbol float-right text-normal text-gray-light\">&rarr;</span></a>\n" +
                "\n" +
                "                    <ul class=\"list-style-none mb-3\">\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/pricing#feature-comparison\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Compare plans\">Compare plans</a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"https://enterprise.github.com/contact\" class=\"py-2 lh-condensed-ultra d-block link-gray no-underline f5\" data-ga-click=\"(Logged out) Header, go to Contact Sales\">Contact Sales</a></li>\n" +
                "                    </ul>\n" +
                "\n" +
                "                    <ul class=\"list-style-none mb-0 border-lg-top pt-lg-3\">\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"/nonprofit\" class=\"py-2 lh-condensed-ultra d-block no-underline link-gray-dark no-underline h5 Bump-link--hover\" data-ga-click=\"(Logged out) Header, go to Nonprofits\">Nonprofit <span class=\"Bump-link-symbol float-right text-normal text-gray-light\">&rarr;</span></a></li>\n" +
                "                      <li class=\"edge-item-fix\"><a href=\"https://education.github.com\" class=\"py-2 pb-0 lh-condensed-ultra d-block no-underline link-gray-dark no-underline h5 Bump-link--hover\"  data-ga-click=\"(Logged out) Header, go to Education\">Education <span class=\"Bump-link-symbol float-right text-normal text-gray-light\">&rarr;</span></a></li>\n" +
                "                    </ul>\n" +
                "                  </div>\n" +
                "                </details>\n" +
                "              </li>\n" +
                "          </ul>\n" +
                "        </nav>\n" +
                "\n" +
                "      <div class=\"d-lg-flex flex-items-center px-3 px-lg-0 text-center text-lg-left\">\n" +
                "          <div class=\"d-lg-flex mb-3 mb-lg-0\">\n" +
                "              <div hidden class=\"d-none\">\n" +
                "</div>\n" +
                "<div class=\"header-search header-search-current js-header-search-current flex-auto  flex-self-stretch flex-md-self-auto mr-0 mr-md-3 mb-3 mb-md-0 scoped-search site-scoped-search js-site-search position-relative js-jump-to js-header-search-current-jump-to \"\n" +
                "  role=\"combobox\"\n" +
                "  aria-owns=\"jump-to-results\"\n" +
                "  aria-label=\"Search or jump to\"\n" +
                "  aria-haspopup=\"listbox\"\n" +
                "  aria-expanded=\"false\"\n" +
                ">\n" +
                "  <div class=\"position-relative\">\n" +
                "    <!-- '\"` --><!-- </textarea></xmp> --></option></form><form class=\"js-site-search-form\" role=\"search\" aria-label=\"Site\" data-scope-type=\"Repository\" data-scope-id=\"293548774\" data-scoped-search-url=\"/qizong007/111800827/search\" data-unscoped-search-url=\"/search\" action=\"/qizong007/111800827/search\" accept-charset=\"UTF-8\" method=\"get\">\n" +
                "      <label class=\"form-control input-sm header-search-wrapper p-0 header-search-wrapper-jump-to position-relative d-flex flex-justify-between flex-items-center js-chromeless-input-container\">\n" +
                "        <input type=\"text\"\n" +
                "          class=\"form-control input-sm header-search-input jump-to-field js-jump-to-field js-site-search-focus js-site-search-field is-clearable\"\n" +
                "          data-hotkey=\"s,/\"\n" +
                "          name=\"q\"\n" +
                "          value=\"\"\n" +
                "          placeholder=\"Search\"\n" +
                "          data-unscoped-placeholder=\"Search GitHub\"\n" +
                "          data-scoped-placeholder=\"Search\"\n" +
                "          autocapitalize=\"off\"\n" +
                "          aria-autocomplete=\"list\"\n" +
                "          aria-controls=\"jump-to-results\"\n" +
                "          aria-label=\"Search\"\n" +
                "          data-jump-to-suggestions-path=\"/_graphql/GetSuggestedNavigationDestinations\"\n" +
                "          spellcheck=\"false\"\n" +
                "          autocomplete=\"off\"\n" +
                "          >\n" +
                "          <input type=\"hidden\" data-csrf=\"true\" class=\"js-data-jump-to-suggestions-path-csrf\" value=\"nnGPSvWjT9WzsuGJWcUBJhATdH/RD0ptgKhF5Mab6UnJ4hy3wlkefy8LyqJ47YnidKunD9MKB1BPWopqHGBmYg==\" />\n" +
                "          <input type=\"hidden\" class=\"js-site-search-type-field\" name=\"type\" >\n" +
                "            <img src=\"https://github.githubassets.com/images/search-key-slash.svg\" alt=\"\" class=\"mr-2 header-search-key-slash\">\n" +
                "\n" +
                "            <div class=\"Box position-absolute overflow-hidden d-none jump-to-suggestions js-jump-to-suggestions-container\">\n" +
                "              \n" +
                "<ul class=\"d-none js-jump-to-suggestions-template-container\">\n" +
                "  \n" +
                "\n" +
                "<li class=\"d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-suggestion\" role=\"option\">\n" +
                "  <a tabindex=\"-1\" class=\"no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2\" href=\"\">\n" +
                "    <div class=\"jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none\">\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none\" title=\"Repository\" aria-label=\"Repository\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z\"></path></svg>\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none\" title=\"Project\" aria-label=\"Project\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z\"></path></svg>\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none\" title=\"Search\" aria-label=\"Search\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M11.5 7a4.499 4.499 0 11-8.998 0A4.499 4.499 0 0111.5 7zm-.82 4.74a6 6 0 111.06-1.06l3.04 3.04a.75.75 0 11-1.06 1.06l-3.04-3.04z\"></path></svg>\n" +
                "    </div>\n" +
                "\n" +
                "    <img class=\"avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none\" alt=\"\" aria-label=\"Team\" src=\"\" width=\"28\" height=\"28\">\n" +
                "\n" +
                "    <div class=\"jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target\">\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none js-jump-to-badge-search\">\n" +
                "      <span class=\"js-jump-to-badge-search-text-default d-none\" aria-label=\"in this repository\">\n" +
                "        In this repository\n" +
                "      </span>\n" +
                "      <span class=\"js-jump-to-badge-search-text-global d-none\" aria-label=\"in all of GitHub\">\n" +
                "        All GitHub\n" +
                "      </span>\n" +
                "      <span aria-hidden=\"true\" class=\"d-inline-block ml-1 v-align-middle\">↵</span>\n" +
                "    </div>\n" +
                "\n" +
                "    <div aria-hidden=\"true\" class=\"border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump\">\n" +
                "      Jump to\n" +
                "      <span class=\"d-inline-block ml-1 v-align-middle\">↵</span>\n" +
                "    </div>\n" +
                "  </a>\n" +
                "</li>\n" +
                "\n" +
                "</ul>\n" +
                "\n" +
                "<ul class=\"d-none js-jump-to-no-results-template-container\">\n" +
                "  <li class=\"d-flex flex-justify-center flex-items-center f5 d-none js-jump-to-suggestion p-2\">\n" +
                "    <span class=\"text-gray\">No suggested jump to results</span>\n" +
                "  </li>\n" +
                "</ul>\n" +
                "\n" +
                "<ul id=\"jump-to-results\" role=\"listbox\" class=\"p-0 m-0 js-navigation-container jump-to-suggestions-results-container js-jump-to-suggestions-results-container\">\n" +
                "  \n" +
                "\n" +
                "<li class=\"d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-scoped-search d-none\" role=\"option\">\n" +
                "  <a tabindex=\"-1\" class=\"no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2\" href=\"\">\n" +
                "    <div class=\"jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none\">\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none\" title=\"Repository\" aria-label=\"Repository\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z\"></path></svg>\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none\" title=\"Project\" aria-label=\"Project\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z\"></path></svg>\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none\" title=\"Search\" aria-label=\"Search\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M11.5 7a4.499 4.499 0 11-8.998 0A4.499 4.499 0 0111.5 7zm-.82 4.74a6 6 0 111.06-1.06l3.04 3.04a.75.75 0 11-1.06 1.06l-3.04-3.04z\"></path></svg>\n" +
                "    </div>\n" +
                "\n" +
                "    <img class=\"avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none\" alt=\"\" aria-label=\"Team\" src=\"\" width=\"28\" height=\"28\">\n" +
                "\n" +
                "    <div class=\"jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target\">\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none js-jump-to-badge-search\">\n" +
                "      <span class=\"js-jump-to-badge-search-text-default d-none\" aria-label=\"in this repository\">\n" +
                "        In this repository\n" +
                "      </span>\n" +
                "      <span class=\"js-jump-to-badge-search-text-global d-none\" aria-label=\"in all of GitHub\">\n" +
                "        All GitHub\n" +
                "      </span>\n" +
                "      <span aria-hidden=\"true\" class=\"d-inline-block ml-1 v-align-middle\">↵</span>\n" +
                "    </div>\n" +
                "\n" +
                "    <div aria-hidden=\"true\" class=\"border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump\">\n" +
                "      Jump to\n" +
                "      <span class=\"d-inline-block ml-1 v-align-middle\">↵</span>\n" +
                "    </div>\n" +
                "  </a>\n" +
                "</li>\n" +
                "\n" +
                "  \n" +
                "\n" +
                "<li class=\"d-flex flex-justify-start flex-items-center p-0 f5 navigation-item js-navigation-item js-jump-to-global-search d-none\" role=\"option\">\n" +
                "  <a tabindex=\"-1\" class=\"no-underline d-flex flex-auto flex-items-center jump-to-suggestions-path js-jump-to-suggestion-path js-navigation-open p-2\" href=\"\">\n" +
                "    <div class=\"jump-to-octicon js-jump-to-octicon flex-shrink-0 mr-2 text-center d-none\">\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-repo flex-shrink-0 js-jump-to-octicon-repo d-none\" title=\"Repository\" aria-label=\"Repository\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z\"></path></svg>\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-project flex-shrink-0 js-jump-to-octicon-project d-none\" title=\"Project\" aria-label=\"Project\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z\"></path></svg>\n" +
                "      <svg height=\"16\" width=\"16\" class=\"octicon octicon-search flex-shrink-0 js-jump-to-octicon-search d-none\" title=\"Search\" aria-label=\"Search\" viewBox=\"0 0 16 16\" version=\"1.1\" role=\"img\"><path fill-rule=\"evenodd\" d=\"M11.5 7a4.499 4.499 0 11-8.998 0A4.499 4.499 0 0111.5 7zm-.82 4.74a6 6 0 111.06-1.06l3.04 3.04a.75.75 0 11-1.06 1.06l-3.04-3.04z\"></path></svg>\n" +
                "    </div>\n" +
                "\n" +
                "    <img class=\"avatar mr-2 flex-shrink-0 js-jump-to-suggestion-avatar d-none\" alt=\"\" aria-label=\"Team\" src=\"\" width=\"28\" height=\"28\">\n" +
                "\n" +
                "    <div class=\"jump-to-suggestion-name js-jump-to-suggestion-name flex-auto overflow-hidden text-left no-wrap css-truncate css-truncate-target\">\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none js-jump-to-badge-search\">\n" +
                "      <span class=\"js-jump-to-badge-search-text-default d-none\" aria-label=\"in this repository\">\n" +
                "        In this repository\n" +
                "      </span>\n" +
                "      <span class=\"js-jump-to-badge-search-text-global d-none\" aria-label=\"in all of GitHub\">\n" +
                "        All GitHub\n" +
                "      </span>\n" +
                "      <span aria-hidden=\"true\" class=\"d-inline-block ml-1 v-align-middle\">↵</span>\n" +
                "    </div>\n" +
                "\n" +
                "    <div aria-hidden=\"true\" class=\"border rounded-1 flex-shrink-0 bg-gray px-1 text-gray-light ml-1 f6 d-none d-on-nav-focus js-jump-to-badge-jump\">\n" +
                "      Jump to\n" +
                "      <span class=\"d-inline-block ml-1 v-align-middle\">↵</span>\n" +
                "    </div>\n" +
                "  </a>\n" +
                "</li>\n" +
                "\n" +
                "\n" +
                "</ul>\n" +
                "\n" +
                "            </div>\n" +
                "      </label>\n" +
                "</form>  </div>\n" +
                "</div>\n" +
                "\n" +
                "          </div>\n" +
                "\n" +
                "        <a href=\"/login?return_to=%2Fqizong007%2F111800827%2Fblob%2Fmaster%2Ftests%2Forig_0.8_dis_10.txt\"\n" +
                "          class=\"HeaderMenu-link no-underline mr-3\"\n" +
                "          data-hydro-click=\"{&quot;event_type&quot;:&quot;authentication.click&quot;,&quot;payload&quot;:{&quot;location_in_page&quot;:&quot;site header menu&quot;,&quot;repository_id&quot;:null,&quot;auth_type&quot;:&quot;SIGN_UP&quot;,&quot;originating_url&quot;:&quot;https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt&quot;,&quot;user_id&quot;:null}}\" data-hydro-click-hmac=\"e72b650f70b005a2c0a59450a20596b3d83e88a8ea544899e8e089e60db40217\"\n" +
                "          data-ga-click=\"(Logged out) Header, clicked Sign in, text:sign-in\">\n" +
                "          Sign&nbsp;in\n" +
                "        </a>\n" +
                "            <a href=\"/join?ref_cta=Sign+up&amp;ref_loc=header+logged+out&amp;ref_page=%2F%3Cuser-name%3E%2F%3Crepo-name%3E%2Fblob%2Fshow&amp;source=header-repo&amp;source_repo=qizong007%2F111800827\"\n" +
                "              class=\"HeaderMenu-link d-inline-block no-underline border border-gray-dark rounded-1 px-2 py-1\"\n" +
                "              data-hydro-click=\"{&quot;event_type&quot;:&quot;authentication.click&quot;,&quot;payload&quot;:{&quot;location_in_page&quot;:&quot;site header menu&quot;,&quot;repository_id&quot;:null,&quot;auth_type&quot;:&quot;SIGN_UP&quot;,&quot;originating_url&quot;:&quot;https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt&quot;,&quot;user_id&quot;:null}}\" data-hydro-click-hmac=\"e72b650f70b005a2c0a59450a20596b3d83e88a8ea544899e8e089e60db40217\"\n" +
                "              data-ga-click=\"Sign up, click to sign up for account, ref_page:/&lt;user-name&gt;/&lt;repo-name&gt;/blob/show;ref_cta:Sign up;ref_loc:header logged out\">\n" +
                "              Sign&nbsp;up\n" +
                "            </a>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</header>\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "  <div id=\"start-of-content\" class=\"show-on-focus\"></div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "    <div id=\"js-flash-container\">\n" +
                "\n" +
                "\n" +
                "  <template class=\"js-flash-template\">\n" +
                "    <div class=\"flash flash-full  {{ className }}\">\n" +
                "  <div class=\" px-2\" >\n" +
                "    <button class=\"flash-close js-flash-close\" type=\"button\" aria-label=\"Dismiss this message\">\n" +
                "      <svg class=\"octicon octicon-x\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z\"></path></svg>\n" +
                "    </button>\n" +
                "    \n" +
                "      <div>{{ message }}</div>\n" +
                "\n" +
                "  </div>\n" +
                "</div>\n" +
                "  </template>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "  <include-fragment class=\"js-notification-shelf-include-fragment\" data-base-src=\"https://github.com/notifications/beta/shelf\"></include-fragment>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <div\n" +
                "    class=\"application-main \"\n" +
                "    data-commit-hovercards-enabled\n" +
                "    data-discussion-hovercards-enabled\n" +
                "    data-issue-and-pr-hovercards-enabled\n" +
                "  >\n" +
                "        <div itemscope itemtype=\"http://schema.org/SoftwareSourceCode\" class=\"\">\n" +
                "    <main  >\n" +
                "      \n" +
                "\n" +
                "    \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "  <div class=\"bg-gray-light pt-3 hide-full-screen mb-5\">\n" +
                "\n" +
                "      <div class=\"d-flex mb-3 px-3 px-md-4 px-lg-5\">\n" +
                "\n" +
                "        <div class=\"flex-auto min-width-0 width-fit mr-3\">\n" +
                "            <h1 class=\" d-flex flex-wrap flex-items-center break-word f3 text-normal\">\n" +
                "    <svg class=\"octicon octicon-repo text-gray\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M2 2.5A2.5 2.5 0 014.5 0h8.75a.75.75 0 01.75.75v12.5a.75.75 0 01-.75.75h-2.5a.75.75 0 110-1.5h1.75v-2h-8a1 1 0 00-.714 1.7.75.75 0 01-1.072 1.05A2.495 2.495 0 012 11.5v-9zm10.5-1V9h-8c-.356 0-.694.074-1 .208V2.5a1 1 0 011-1h8zM5 12.25v3.25a.25.25 0 00.4.2l1.45-1.087a.25.25 0 01.3 0L8.6 15.7a.25.25 0 00.4-.2v-3.25a.25.25 0 00-.25-.25h-3.5a.25.25 0 00-.25.25z\"></path></svg>\n" +
                "  <span class=\"author ml-2 flex-self-stretch\" itemprop=\"author\">\n" +
                "    <a class=\"url fn\" rel=\"author\" data-hovercard-type=\"user\" data-hovercard-url=\"/users/qizong007/hovercard\" data-octo-click=\"hovercard-link-click\" data-octo-dimensions=\"link_type:self\" href=\"/qizong007\">qizong007</a>\n" +
                "  </span>\n" +
                "  <span class=\"mx-1 flex-self-stretch\">/</span>\n" +
                "  <strong itemprop=\"name\" class=\"mr-2 flex-self-stretch\">\n" +
                "    <a data-pjax=\"#js-repo-pjax-container\" href=\"/qizong007/111800827\">111800827</a>\n" +
                "  </strong>\n" +
                "  \n" +
                "</h1>\n" +
                "\n" +
                "\n" +
                "        </div>\n" +
                "\n" +
                "          <ul class=\"pagehead-actions flex-shrink-0 d-none d-md-inline\" style=\"padding: 2px 0;\">\n" +
                "\n" +
                "  <li>\n" +
                "          <a class=\"tooltipped tooltipped-s btn btn-sm btn-with-count\" aria-label=\"You must be signed in to watch a repository\" rel=\"nofollow\" data-hydro-click=\"{&quot;event_type&quot;:&quot;authentication.click&quot;,&quot;payload&quot;:{&quot;location_in_page&quot;:&quot;notification subscription menu watch&quot;,&quot;repository_id&quot;:null,&quot;auth_type&quot;:&quot;LOG_IN&quot;,&quot;originating_url&quot;:&quot;https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt&quot;,&quot;user_id&quot;:null}}\" data-hydro-click-hmac=\"ec00d136be65d07cc96cae5e2502432be0c9d90cdfc3dab2e07bedbae0cdff5e\" href=\"/login?return_to=%2Fqizong007%2F111800827\">\n" +
                "    <svg height=\"16\" class=\"octicon octicon-eye\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M1.679 7.932c.412-.621 1.242-1.75 2.366-2.717C5.175 4.242 6.527 3.5 8 3.5c1.473 0 2.824.742 3.955 1.715 1.124.967 1.954 2.096 2.366 2.717a.119.119 0 010 .136c-.412.621-1.242 1.75-2.366 2.717C10.825 11.758 9.473 12.5 8 12.5c-1.473 0-2.824-.742-3.955-1.715C2.92 9.818 2.09 8.69 1.679 8.068a.119.119 0 010-.136zM8 2c-1.981 0-3.67.992-4.933 2.078C1.797 5.169.88 6.423.43 7.1a1.619 1.619 0 000 1.798c.45.678 1.367 1.932 2.637 3.024C4.329 13.008 6.019 14 8 14c1.981 0 3.67-.992 4.933-2.078 1.27-1.091 2.187-2.345 2.637-3.023a1.619 1.619 0 000-1.798c-.45-.678-1.367-1.932-2.637-3.023C11.671 2.992 9.981 2 8 2zm0 8a2 2 0 100-4 2 2 0 000 4z\"></path></svg>\n" +
                "    Watch\n" +
                "</a>    <a class=\"social-count\" href=\"/qizong007/111800827/watchers\"\n" +
                "       aria-label=\"1 user is watching this repository\">\n" +
                "      1\n" +
                "    </a>\n" +
                "\n" +
                "  </li>\n" +
                "\n" +
                "  <li>\n" +
                "          <a class=\"btn btn-sm btn-with-count  tooltipped tooltipped-s\" aria-label=\"You must be signed in to star a repository\" rel=\"nofollow\" data-hydro-click=\"{&quot;event_type&quot;:&quot;authentication.click&quot;,&quot;payload&quot;:{&quot;location_in_page&quot;:&quot;star button&quot;,&quot;repository_id&quot;:293548774,&quot;auth_type&quot;:&quot;LOG_IN&quot;,&quot;originating_url&quot;:&quot;https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt&quot;,&quot;user_id&quot;:null}}\" data-hydro-click-hmac=\"ed292a680085bcf67dbef5a5e07bca9b0c4e34cd6044a7d7dab450673ace129b\" href=\"/login?return_to=%2Fqizong007%2F111800827\">\n" +
                "      <svg vertical_align=\"text_bottom\" height=\"16\" class=\"octicon octicon-star v-align-text-bottom\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M8 .25a.75.75 0 01.673.418l1.882 3.815 4.21.612a.75.75 0 01.416 1.279l-3.046 2.97.719 4.192a.75.75 0 01-1.088.791L8 12.347l-3.766 1.98a.75.75 0 01-1.088-.79l.72-4.194L.818 6.374a.75.75 0 01.416-1.28l4.21-.611L7.327.668A.75.75 0 018 .25zm0 2.445L6.615 5.5a.75.75 0 01-.564.41l-3.097.45 2.24 2.184a.75.75 0 01.216.664l-.528 3.084 2.769-1.456a.75.75 0 01.698 0l2.77 1.456-.53-3.084a.75.75 0 01.216-.664l2.24-2.183-3.096-.45a.75.75 0 01-.564-.41L8 2.694v.001z\"></path></svg>\n" +
                "      Star\n" +
                "</a>\n" +
                "    <a class=\"social-count js-social-count\" href=\"/qizong007/111800827/stargazers\"\n" +
                "      aria-label=\"0 users starred this repository\">\n" +
                "      0\n" +
                "    </a>\n" +
                "\n" +
                "  </li>\n" +
                "\n" +
                "  <li>\n" +
                "        <a class=\"btn btn-sm btn-with-count tooltipped tooltipped-s\" aria-label=\"You must be signed in to fork a repository\" rel=\"nofollow\" data-hydro-click=\"{&quot;event_type&quot;:&quot;authentication.click&quot;,&quot;payload&quot;:{&quot;location_in_page&quot;:&quot;repo details fork button&quot;,&quot;repository_id&quot;:293548774,&quot;auth_type&quot;:&quot;LOG_IN&quot;,&quot;originating_url&quot;:&quot;https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt&quot;,&quot;user_id&quot;:null}}\" data-hydro-click-hmac=\"035f703675162407c4d681b64bc870451e972a09d49f26490c67740242e0740a\" href=\"/login?return_to=%2Fqizong007%2F111800827\">\n" +
                "          <svg class=\"octicon octicon-repo-forked\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M5 3.25a.75.75 0 11-1.5 0 .75.75 0 011.5 0zm0 2.122a2.25 2.25 0 10-1.5 0v.878A2.25 2.25 0 005.75 8.5h1.5v2.128a2.251 2.251 0 101.5 0V8.5h1.5a2.25 2.25 0 002.25-2.25v-.878a2.25 2.25 0 10-1.5 0v.878a.75.75 0 01-.75.75h-4.5A.75.75 0 015 6.25v-.878zm3.75 7.378a.75.75 0 11-1.5 0 .75.75 0 011.5 0zm3-8.75a.75.75 0 100-1.5.75.75 0 000 1.5z\"></path></svg>\n" +
                "          Fork\n" +
                "</a>\n" +
                "      <a href=\"/qizong007/111800827/network/members\" class=\"social-count\"\n" +
                "         aria-label=\"1 user forked this repository\">\n" +
                "        1\n" +
                "      </a>\n" +
                "  </li>\n" +
                "</ul>\n" +
                "\n" +
                "      </div>\n" +
                "        \n" +
                "<nav aria-label=\"Repository\" data-pjax=\"#js-repo-pjax-container\" class=\"js-repo-nav js-sidenav-container-pjax js-responsive-underlinenav overflow-hidden UnderlineNav px-3 px-md-4 px-lg-5 bg-gray-light\">\n" +
                "  <ul class=\"UnderlineNav-body list-style-none \">\n" +
                "          <li class=\"d-flex\">\n" +
                "        <a class=\"js-selected-navigation-item selected UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item\" data-tab-item=\"code-tab\" data-hotkey=\"g c\" data-ga-click=\"Repository, Navigation click, Code tab\" aria-current=\"page\" data-selected-links=\"repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches repo_packages repo_deployments /qizong007/111800827\" href=\"/qizong007/111800827\">\n" +
                "              <svg classes=\"UnderlineNav-octicon\" display=\"none inline\" height=\"16\" class=\"octicon octicon-code UnderlineNav-octicon d-none d-sm-inline\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M4.72 3.22a.75.75 0 011.06 1.06L2.06 8l3.72 3.72a.75.75 0 11-1.06 1.06L.47 8.53a.75.75 0 010-1.06l4.25-4.25zm6.56 0a.75.75 0 10-1.06 1.06L13.94 8l-3.72 3.72a.75.75 0 101.06 1.06l4.25-4.25a.75.75 0 000-1.06l-4.25-4.25z\"></path></svg>\n" +
                "            <span data-content=\"Code\">Code</span>\n" +
                "              <span title=\"Not available\" class=\"Counter \"></span>\n" +
                "</a>      </li>\n" +
                "      <li class=\"d-flex\">\n" +
                "        <a class=\"js-selected-navigation-item UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item\" data-tab-item=\"issues-tab\" data-hotkey=\"g i\" data-ga-click=\"Repository, Navigation click, Issues tab\" data-selected-links=\"repo_issues repo_labels repo_milestones /qizong007/111800827/issues\" href=\"/qizong007/111800827/issues\">\n" +
                "              <svg classes=\"UnderlineNav-octicon\" display=\"none inline\" height=\"16\" class=\"octicon octicon-issue-opened UnderlineNav-octicon d-none d-sm-inline\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M8 1.5a6.5 6.5 0 100 13 6.5 6.5 0 000-13zM0 8a8 8 0 1116 0A8 8 0 010 8zm9 3a1 1 0 11-2 0 1 1 0 012 0zm-.25-6.25a.75.75 0 00-1.5 0v3.5a.75.75 0 001.5 0v-3.5z\"></path></svg>\n" +
                "            <span data-content=\"Issues\">Issues</span>\n" +
                "              <span title=\"0\" hidden=\"hidden\" class=\"Counter \">0</span>\n" +
                "</a>      </li>\n" +
                "      <li class=\"d-flex\">\n" +
                "        <a class=\"js-selected-navigation-item UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item\" data-tab-item=\"pull-requests-tab\" data-hotkey=\"g p\" data-ga-click=\"Repository, Navigation click, Pull requests tab\" data-selected-links=\"repo_pulls checks /qizong007/111800827/pulls\" href=\"/qizong007/111800827/pulls\">\n" +
                "              <svg classes=\"UnderlineNav-octicon\" display=\"none inline\" height=\"16\" class=\"octicon octicon-git-pull-request UnderlineNav-octicon d-none d-sm-inline\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M7.177 3.073L9.573.677A.25.25 0 0110 .854v4.792a.25.25 0 01-.427.177L7.177 3.427a.25.25 0 010-.354zM3.75 2.5a.75.75 0 100 1.5.75.75 0 000-1.5zm-2.25.75a2.25 2.25 0 113 2.122v5.256a2.251 2.251 0 11-1.5 0V5.372A2.25 2.25 0 011.5 3.25zM11 2.5h-1V4h1a1 1 0 011 1v5.628a2.251 2.251 0 101.5 0V5A2.5 2.5 0 0011 2.5zm1 10.25a.75.75 0 111.5 0 .75.75 0 01-1.5 0zM3.75 12a.75.75 0 100 1.5.75.75 0 000-1.5z\"></path></svg>\n" +
                "            <span data-content=\"Pull requests\">Pull requests</span>\n" +
                "              <span title=\"0\" hidden=\"hidden\" class=\"Counter \">0</span>\n" +
                "</a>      </li>\n" +
                "      <li class=\"d-flex\">\n" +
                "        <a class=\"js-selected-navigation-item UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item\" data-tab-item=\"actions-tab\" data-hotkey=\"g a\" data-ga-click=\"Repository, Navigation click, Actions tab\" data-selected-links=\"repo_actions /qizong007/111800827/actions\" href=\"/qizong007/111800827/actions\">\n" +
                "              <svg classes=\"UnderlineNav-octicon\" display=\"none inline\" height=\"16\" class=\"octicon octicon-play UnderlineNav-octicon d-none d-sm-inline\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M1.5 8a6.5 6.5 0 1113 0 6.5 6.5 0 01-13 0zM8 0a8 8 0 100 16A8 8 0 008 0zM6.379 5.227A.25.25 0 006 5.442v5.117a.25.25 0 00.379.214l4.264-2.559a.25.25 0 000-.428L6.379 5.227z\"></path></svg>\n" +
                "            <span data-content=\"Actions\">Actions</span>\n" +
                "              <span title=\"Not available\" class=\"Counter \"></span>\n" +
                "</a>      </li>\n" +
                "      <li class=\"d-flex\">\n" +
                "        <a class=\"js-selected-navigation-item UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item\" data-tab-item=\"projects-tab\" data-hotkey=\"g b\" data-ga-click=\"Repository, Navigation click, Projects tab\" data-selected-links=\"repo_projects new_repo_project repo_project /qizong007/111800827/projects\" href=\"/qizong007/111800827/projects\">\n" +
                "              <svg classes=\"UnderlineNav-octicon\" display=\"none inline\" height=\"16\" class=\"octicon octicon-project UnderlineNav-octicon d-none d-sm-inline\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M1.75 0A1.75 1.75 0 000 1.75v12.5C0 15.216.784 16 1.75 16h12.5A1.75 1.75 0 0016 14.25V1.75A1.75 1.75 0 0014.25 0H1.75zM1.5 1.75a.25.25 0 01.25-.25h12.5a.25.25 0 01.25.25v12.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25V1.75zM11.75 3a.75.75 0 00-.75.75v7.5a.75.75 0 001.5 0v-7.5a.75.75 0 00-.75-.75zm-8.25.75a.75.75 0 011.5 0v5.5a.75.75 0 01-1.5 0v-5.5zM8 3a.75.75 0 00-.75.75v3.5a.75.75 0 001.5 0v-3.5A.75.75 0 008 3z\"></path></svg>\n" +
                "            <span data-content=\"Projects\">Projects</span>\n" +
                "              <span title=\"0\" hidden=\"hidden\" class=\"Counter \">0</span>\n" +
                "</a>      </li>\n" +
                "      <li class=\"d-flex\">\n" +
                "        <a class=\"js-selected-navigation-item UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item\" data-tab-item=\"security-tab\" data-hotkey=\"g s\" data-ga-click=\"Repository, Navigation click, Security tab\" data-selected-links=\"security overview alerts policy token_scanning code_scanning /qizong007/111800827/security\" href=\"/qizong007/111800827/security\">\n" +
                "              <svg classes=\"UnderlineNav-octicon\" display=\"none inline\" height=\"16\" class=\"octicon octicon-shield UnderlineNav-octicon d-none d-sm-inline\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M7.467.133a1.75 1.75 0 011.066 0l5.25 1.68A1.75 1.75 0 0115 3.48V7c0 1.566-.32 3.182-1.303 4.682-.983 1.498-2.585 2.813-5.032 3.855a1.7 1.7 0 01-1.33 0c-2.447-1.042-4.049-2.357-5.032-3.855C1.32 10.182 1 8.566 1 7V3.48a1.75 1.75 0 011.217-1.667l5.25-1.68zm.61 1.429a.25.25 0 00-.153 0l-5.25 1.68a.25.25 0 00-.174.238V7c0 1.358.275 2.666 1.057 3.86.784 1.194 2.121 2.34 4.366 3.297a.2.2 0 00.154 0c2.245-.956 3.582-2.104 4.366-3.298C13.225 9.666 13.5 8.36 13.5 7V3.48a.25.25 0 00-.174-.237l-5.25-1.68zM9 10.5a1 1 0 11-2 0 1 1 0 012 0zm-.25-5.75a.75.75 0 10-1.5 0v3a.75.75 0 001.5 0v-3z\"></path></svg>\n" +
                "            <span data-content=\"Security\">Security</span>\n" +
                "              <include-fragment src=\"/qizong007/111800827/security/overall-count\" accept=\"text/fragment+html\"></include-fragment>\n" +
                "</a>      </li>\n" +
                "      <li class=\"d-flex\">\n" +
                "        <a class=\"js-selected-navigation-item UnderlineNav-item hx_underlinenav-item no-wrap js-responsive-underlinenav-item\" data-tab-item=\"insights-tab\" data-ga-click=\"Repository, Navigation click, Insights tab\" data-selected-links=\"repo_graphs repo_contributors dependency_graph dependabot_updates pulse people /qizong007/111800827/pulse\" href=\"/qizong007/111800827/pulse\">\n" +
                "              <svg classes=\"UnderlineNav-octicon\" display=\"none inline\" height=\"16\" class=\"octicon octicon-graph UnderlineNav-octicon d-none d-sm-inline\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M1.5 1.75a.75.75 0 00-1.5 0v12.5c0 .414.336.75.75.75h14.5a.75.75 0 000-1.5H1.5V1.75zm14.28 2.53a.75.75 0 00-1.06-1.06L10 7.94 7.53 5.47a.75.75 0 00-1.06 0L3.22 8.72a.75.75 0 001.06 1.06L7 7.06l2.47 2.47a.75.75 0 001.06 0l5.25-5.25z\"></path></svg>\n" +
                "            <span data-content=\"Insights\">Insights</span>\n" +
                "              <span title=\"Not available\" class=\"Counter \"></span>\n" +
                "</a>      </li>\n" +
                "\n" +
                "</ul>        <div class=\"position-absolute right-0 pr-3 pr-md-4 pr-lg-5 js-responsive-underlinenav-overflow\" style=\"visibility:hidden;\">\n" +
                "      <details class=\"details-overlay details-reset position-relative\">\n" +
                "  <summary role=\"button\">\n" +
                "    <div class=\"UnderlineNav-item mr-0 border-0\">\n" +
                "            <svg class=\"octicon octicon-kebab-horizontal\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path d=\"M8 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zM1.5 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zm13 0a1.5 1.5 0 100-3 1.5 1.5 0 000 3z\"></path></svg>\n" +
                "            <span class=\"sr-only\">More</span>\n" +
                "          </div>\n" +
                "</summary>  <div>\n" +
                "    <details-menu role=\"menu\" class=\"dropdown-menu dropdown-menu-sw \">\n" +
                "  \n" +
                "            <ul>\n" +
                "                <li data-menu-item=\"code-tab\" hidden>\n" +
                "                  <a role=\"menuitem\" class=\"js-selected-navigation-item dropdown-item\" data-selected-links=\" /qizong007/111800827\" href=\"/qizong007/111800827\">\n" +
                "                    Code\n" +
                "</a>                </li>\n" +
                "                <li data-menu-item=\"issues-tab\" hidden>\n" +
                "                  <a role=\"menuitem\" class=\"js-selected-navigation-item dropdown-item\" data-selected-links=\" /qizong007/111800827/issues\" href=\"/qizong007/111800827/issues\">\n" +
                "                    Issues\n" +
                "</a>                </li>\n" +
                "                <li data-menu-item=\"pull-requests-tab\" hidden>\n" +
                "                  <a role=\"menuitem\" class=\"js-selected-navigation-item dropdown-item\" data-selected-links=\" /qizong007/111800827/pulls\" href=\"/qizong007/111800827/pulls\">\n" +
                "                    Pull requests\n" +
                "</a>                </li>\n" +
                "                <li data-menu-item=\"actions-tab\" hidden>\n" +
                "                  <a role=\"menuitem\" class=\"js-selected-navigation-item dropdown-item\" data-selected-links=\" /qizong007/111800827/actions\" href=\"/qizong007/111800827/actions\">\n" +
                "                    Actions\n" +
                "</a>                </li>\n" +
                "                <li data-menu-item=\"projects-tab\" hidden>\n" +
                "                  <a role=\"menuitem\" class=\"js-selected-navigation-item dropdown-item\" data-selected-links=\" /qizong007/111800827/projects\" href=\"/qizong007/111800827/projects\">\n" +
                "                    Projects\n" +
                "</a>                </li>\n" +
                "                <li data-menu-item=\"security-tab\" hidden>\n" +
                "                  <a role=\"menuitem\" class=\"js-selected-navigation-item dropdown-item\" data-selected-links=\" /qizong007/111800827/security\" href=\"/qizong007/111800827/security\">\n" +
                "                    Security\n" +
                "</a>                </li>\n" +
                "                <li data-menu-item=\"insights-tab\" hidden>\n" +
                "                  <a role=\"menuitem\" class=\"js-selected-navigation-item dropdown-item\" data-selected-links=\" /qizong007/111800827/pulse\" href=\"/qizong007/111800827/pulse\">\n" +
                "                    Insights\n" +
                "</a>                </li>\n" +
                "            </ul>\n" +
                "\n" +
                "</details-menu>\n" +
                "</div></details>    </div>\n" +
                "\n" +
                "</nav>\n" +
                "  </div>\n" +
                "\n" +
                "<div class=\"container-xl clearfix new-discussion-timeline  px-3 px-md-4 px-lg-5\">\n" +
                "  <div class=\"repository-content \" >\n" +
                "\n" +
                "    \n" +
                "      \n" +
                "  \n" +
                "\n" +
                "\n" +
                "    <a class=\"d-none js-permalink-shortcut\" data-hotkey=\"y\" href=\"/qizong007/111800827/blob/10d73c4a2856225d50966aefd866e10c76736349/tests/orig_0.8_dis_10.txt\">Permalink</a>\n" +
                "\n" +
                "    <!-- blob contrib key: blob_contributors:v22:e259c2db1e8f3cff9009630016f4362ebbb704d75b602dd73bf5da3680c7d1fb -->\n" +
                "      <signup-prompt class=\"signup-prompt-bg rounded-1\" data-prompt=\"signup\" hidden>\n" +
                "    <div class=\"signup-prompt p-4 text-center mb-4 rounded-1\">\n" +
                "      <div class=\"position-relative\">\n" +
                "        <button\n" +
                "          type=\"button\"\n" +
                "          class=\"position-absolute top-0 right-0 btn-link link-gray\"\n" +
                "          data-action=\"click:signup-prompt#dismiss\"\n" +
                "          data-ga-click=\"(Logged out) Sign up prompt, clicked Dismiss, text:dismiss\"\n" +
                "        >\n" +
                "          Dismiss\n" +
                "        </button>\n" +
                "        <h3 class=\"pt-2\">Join GitHub today</h3>\n" +
                "        <p class=\"col-6 mx-auto\">GitHub is home to over 50 million developers working together to host and review code, manage projects, and build software together.</p>\n" +
                "        <a class=\"btn btn-primary\" data-ga-click=\"(Logged out) Sign up prompt, clicked Sign up, text:sign-up\" data-hydro-click=\"{&quot;event_type&quot;:&quot;authentication.click&quot;,&quot;payload&quot;:{&quot;location_in_page&quot;:&quot;files signup prompt&quot;,&quot;repository_id&quot;:null,&quot;auth_type&quot;:&quot;SIGN_UP&quot;,&quot;originating_url&quot;:&quot;https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt&quot;,&quot;user_id&quot;:null}}\" data-hydro-click-hmac=\"344a26f476229efd8228c9c12e0cf45cb0b137791df1233af644951f980f1778\" href=\"/join?source=prompt-blob-show&amp;source_repo=qizong007%2F111800827\">Sign up</a>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </signup-prompt>\n" +
                "\n" +
                "\n" +
                "    <div class=\"d-flex flex-items-start flex-shrink-0 pb-3 flex-wrap flex-md-nowrap flex-justify-between flex-md-justify-start\">\n" +
                "      \n" +
                "<div class=\"position-relative\">\n" +
                "  <details class=\"details-reset details-overlay mr-0 mb-0 \" id=\"branch-select-menu\">\n" +
                "    <summary class=\"btn css-truncate\"\n" +
                "            data-hotkey=\"w\"\n" +
                "            title=\"Switch branches or tags\">\n" +
                "      <svg text=\"gray\" height=\"16\" class=\"octicon octicon-git-branch text-gray\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M11.75 2.5a.75.75 0 100 1.5.75.75 0 000-1.5zm-2.25.75a2.25 2.25 0 113 2.122V6A2.5 2.5 0 0110 8.5H6a1 1 0 00-1 1v1.128a2.251 2.251 0 11-1.5 0V5.372a2.25 2.25 0 111.5 0v1.836A2.492 2.492 0 016 7h4a1 1 0 001-1v-.628A2.25 2.25 0 019.5 3.25zM4.25 12a.75.75 0 100 1.5.75.75 0 000-1.5zM3.5 3.25a.75.75 0 111.5 0 .75.75 0 01-1.5 0z\"></path></svg>\n" +
                "      <span class=\"css-truncate-target\" data-menu-button>master</span>\n" +
                "      <span class=\"dropdown-caret\"></span>\n" +
                "    </summary>\n" +
                "\n" +
                "    <details-menu class=\"SelectMenu SelectMenu--hasFilter\" src=\"/qizong007/111800827/refs/master/tests/orig_0.8_dis_10.txt?source_action=show&amp;source_controller=blob\" preload>\n" +
                "      <div class=\"SelectMenu-modal\">\n" +
                "        <include-fragment class=\"SelectMenu-loading\" aria-label=\"Menu is loading\">\n" +
                "          <svg class=\"octicon octicon-octoface anim-pulse\" height=\"32\" viewBox=\"0 0 24 24\" version=\"1.1\" width=\"32\" aria-hidden=\"true\"><path d=\"M7.75 11c-.69 0-1.25.56-1.25 1.25v1.5a1.25 1.25 0 102.5 0v-1.5C9 11.56 8.44 11 7.75 11zm1.27 4.5a.469.469 0 01.48-.5h5a.47.47 0 01.48.5c-.116 1.316-.759 2.5-2.98 2.5s-2.864-1.184-2.98-2.5zm7.23-4.5c-.69 0-1.25.56-1.25 1.25v1.5a1.25 1.25 0 102.5 0v-1.5c0-.69-.56-1.25-1.25-1.25z\"></path><path fill-rule=\"evenodd\" d=\"M21.255 3.82a1.725 1.725 0 00-2.141-1.195c-.557.16-1.406.44-2.264.866-.78.386-1.647.93-2.293 1.677A18.442 18.442 0 0012 5c-.93 0-1.784.059-2.569.17-.645-.74-1.505-1.28-2.28-1.664a13.876 13.876 0 00-2.265-.866 1.725 1.725 0 00-2.141 1.196 23.645 23.645 0 00-.69 3.292c-.125.97-.191 2.07-.066 3.112C1.254 11.882 1 13.734 1 15.527 1 19.915 3.13 23 12 23c8.87 0 11-3.053 11-7.473 0-1.794-.255-3.647-.99-5.29.127-1.046.06-2.15-.066-3.125a23.652 23.652 0 00-.689-3.292zM20.5 14c.5 3.5-1.5 6.5-8.5 6.5s-9-3-8.5-6.5c.583-4 3-6 8.5-6s7.928 2 8.5 6z\"></path></svg>\n" +
                "        </include-fragment>\n" +
                "      </div>\n" +
                "    </details-menu>\n" +
                "  </details>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "      <h2 id=\"blob-path\" class=\"breadcrumb flex-auto min-width-0 text-normal mx-0 mx-md-3 width-full width-md-auto flex-order-1 flex-md-order-none mt-3 mt-md-0\">\n" +
                "        <span class=\"js-repo-root text-bold\"><span class=\"js-path-segment d-inline-block wb-break-all\"><a data-pjax=\"true\" href=\"/qizong007/111800827\"><span>111800827</span></a></span></span><span class=\"separator\">/</span><span class=\"js-path-segment d-inline-block wb-break-all\"><a data-pjax=\"true\" href=\"/qizong007/111800827/tree/master/tests\"><span>tests</span></a></span><span class=\"separator\">/</span><strong class=\"final-path\">orig_0.8_dis_10.txt</strong>\n" +
                "      </h2>\n" +
                "      <a href=\"/qizong007/111800827/find/master\"\n" +
                "            class=\"js-pjax-capture-input btn mr-2 d-none d-md-block\"\n" +
                "            data-pjax\n" +
                "            data-hotkey=\"t\">\n" +
                "        Go to file\n" +
                "      </a>\n" +
                "\n" +
                "      <details id=\"blob-more-options-details\" class=\"details-overlay details-reset position-relative\">\n" +
                "  <summary role=\"button\">\n" +
                "    <svg aria-label=\"More options\" height=\"16\" class=\"octicon octicon-kebab-horizontal\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" role=\"img\"><path d=\"M8 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zM1.5 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zm13 0a1.5 1.5 0 100-3 1.5 1.5 0 000 3z\"></path></svg>\n" +
                "</summary>  <div>\n" +
                "    <ul class=\"dropdown-menu dropdown-menu-sw\">\n" +
                "            <li class=\"d-block d-md-none\">\n" +
                "              <a class=\"dropdown-item d-flex flex-items-baseline\" data-hydro-click=\"{&quot;event_type&quot;:&quot;repository.click&quot;,&quot;payload&quot;:{&quot;target&quot;:&quot;FIND_FILE_BUTTON&quot;,&quot;repository_id&quot;:293548774,&quot;originating_url&quot;:&quot;https://github.com/qizong007/111800827/blob/master/tests/orig_0.8_dis_10.txt&quot;,&quot;user_id&quot;:null}}\" data-hydro-click-hmac=\"1f11f3ea11a66ed6449cc8c4701351bfc4ce186e55fe134bd0a1628c8a8c492f\" data-ga-click=\"Repository, find file, location:repo overview\" data-hotkey=\"t\" data-pjax=\"true\" href=\"/qizong007/111800827/find/master\">\n" +
                "                <span class=\"flex-auto\">Go to file</span>\n" +
                "                <span class=\"text-small text-gray\" aria-hidden=\"true\">T</span>\n" +
                "</a>            </li>\n" +
                "            <li data-toggle-for=\"blob-more-options-details\">\n" +
                "              <button type=\"button\" data-toggle-for=\"jumpto-line-details-dialog\" class=\"btn-link dropdown-item\">\n" +
                "                <span class=\"d-flex flex-items-baseline\">\n" +
                "                  <span class=\"flex-auto\">Go to line</span>\n" +
                "                  <span class=\"text-small text-gray\" aria-hidden=\"true\">L</span>\n" +
                "                </span>\n" +
                "              </button>\n" +
                "            </li>\n" +
                "            <li class=\"dropdown-divider\" role=\"none\"></li>\n" +
                "            <li>\n" +
                "              <clipboard-copy value=\"tests/orig_0.8_dis_10.txt\" class=\"dropdown-item cursor-pointer\" data-toggle-for=\"blob-more-options-details\">\n" +
                "                Copy path\n" +
                "              </clipboard-copy>\n" +
                "            </li>\n" +
                "          </ul>\n" +
                "</div></details>    </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "    <div class=\"Box d-flex flex-column flex-shrink-0 mb-3\">\n" +
                "      <include-fragment src=\"/qizong007/111800827/contributors/master/tests/orig_0.8_dis_10.txt\" class=\"commit-loader\">\n" +
                "        <div class=\"Box-header Box-header--blue d-flex flex-items-center\">\n" +
                "          <div class=\"Skeleton avatar avatar-user flex-shrink-0 ml-n1 mr-n1 mt-n1 mb-n1\" style=\"width:24px;height:24px;\"></div>\n" +
                "          <div class=\"Skeleton Skeleton--text col-5 ml-2\">&nbsp;</div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"Box-body d-flex flex-items-center\" >\n" +
                "          <div class=\"Skeleton Skeleton--text col-1\">&nbsp;</div>\n" +
                "          <span class=\"text-red h6 loader-error\">Cannot retrieve contributors at this time</span>\n" +
                "        </div>\n" +
                "</include-fragment>    </div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "    <div class=\"Box mt-3 position-relative\n" +
                "      \">\n" +
                "      \n" +
                "<div class=\"Box-header py-2 d-flex flex-column flex-shrink-0 flex-md-row flex-md-items-center\">\n" +
                "  <div class=\"text-mono f6 flex-auto pr-3 flex-order-2 flex-md-order-1 mt-2 mt-md-0\">\n" +
                "\n" +
                "      330 lines (184 sloc)\n" +
                "      <span class=\"file-info-divider\"></span>\n" +
                "    28.9 KB\n" +
                "  </div>\n" +
                "\n" +
                "  <div class=\"d-flex py-1 py-md-0 flex-auto flex-order-1 flex-md-order-2 flex-sm-grow-0 flex-justify-between\">\n" +
                "\n" +
                "    <div class=\"BtnGroup\">\n" +
                "      <a href=\"/qizong007/111800827/raw/master/tests/orig_0.8_dis_10.txt\" id=\"raw-url\" role=\"button\" class=\"btn btn-sm BtnGroup-item \">Raw</a>\n" +
                "        <a href=\"/qizong007/111800827/blame/master/tests/orig_0.8_dis_10.txt\" data-hotkey=\"b\" role=\"button\" class=\"btn js-update-url-with-hash btn-sm BtnGroup-item \">Blame</a>\n" +
                "    </div>\n" +
                "\n" +
                "    <div>\n" +
                "          <a class=\"btn-octicon tooltipped tooltipped-nw js-remove-unless-platform\"\n" +
                "             data-platforms=\"windows,mac\"\n" +
                "             href=\"https://desktop.github.com\"\n" +
                "             aria-label=\"Open this file in GitHub Desktop\"\n" +
                "             data-ga-click=\"Repository, open with desktop\">\n" +
                "              <svg class=\"octicon octicon-device-desktop\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M1.75 2.5h12.5a.25.25 0 01.25.25v7.5a.25.25 0 01-.25.25H1.75a.25.25 0 01-.25-.25v-7.5a.25.25 0 01.25-.25zM14.25 1H1.75A1.75 1.75 0 000 2.75v7.5C0 11.216.784 12 1.75 12h3.727c-.1 1.041-.52 1.872-1.292 2.757A.75.75 0 004.75 16h6.5a.75.75 0 00.565-1.243c-.772-.885-1.193-1.716-1.292-2.757h3.727A1.75 1.75 0 0016 10.25v-7.5A1.75 1.75 0 0014.25 1zM9.018 12H6.982a5.72 5.72 0 01-.765 2.5h3.566a5.72 5.72 0 01-.765-2.5z\"></path></svg>\n" +
                "          </a>\n" +
                "\n" +
                "          <a href=\"/login?return_to=%2Fqizong007%2F111800827%2Fblob%2Fmaster%2Ftests%2Forig_0.8_dis_10.txt\" class=\"btn-octicon disabled tooltipped tooltipped-nw\"\n" +
                "            aria-label=\"You must be signed in to make or propose changes\">\n" +
                "            <svg class=\"octicon octicon-pencil\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M11.013 1.427a1.75 1.75 0 012.474 0l1.086 1.086a1.75 1.75 0 010 2.474l-8.61 8.61c-.21.21-.47.364-.756.445l-3.251.93a.75.75 0 01-.927-.928l.929-3.25a1.75 1.75 0 01.445-.758l8.61-8.61zm1.414 1.06a.25.25 0 00-.354 0L10.811 3.75l1.439 1.44 1.263-1.263a.25.25 0 000-.354l-1.086-1.086zM11.189 6.25L9.75 4.81l-6.286 6.287a.25.25 0 00-.064.108l-.558 1.953 1.953-.558a.249.249 0 00.108-.064l6.286-6.286z\"></path></svg>\n" +
                "          </a>\n" +
                "          <a href=\"/login?return_to=%2Fqizong007%2F111800827%2Fblob%2Fmaster%2Ftests%2Forig_0.8_dis_10.txt\" class=\"btn-octicon btn-octicon-danger disabled tooltipped tooltipped-nw\"\n" +
                "            aria-label=\"You must be signed in to make or propose changes\">\n" +
                "            <svg class=\"octicon octicon-trashcan\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M6.5 1.75a.25.25 0 01.25-.25h2.5a.25.25 0 01.25.25V3h-3V1.75zm4.5 0V3h2.25a.75.75 0 010 1.5H2.75a.75.75 0 010-1.5H5V1.75C5 .784 5.784 0 6.75 0h2.5C10.216 0 11 .784 11 1.75zM4.496 6.675a.75.75 0 10-1.492.15l.66 6.6A1.75 1.75 0 005.405 15h5.19c.9 0 1.652-.681 1.741-1.576l.66-6.6a.75.75 0 00-1.492-.149l-.66 6.6a.25.25 0 01-.249.225h-5.19a.25.25 0 01-.249-.225l-.66-6.6z\"></path></svg>\n" +
                "          </a>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "      \n" +
                "\n" +
                "  <div itemprop=\"text\" class=\"Box-body p-0 blob-wrapper data type-text  gist-border-0\">\n" +
                "      \n" +
                "<table class=\"highlight tab-size js-file-line-container\" data-tab-size=\"8\" data-paste-markdown-skip>\n" +
                "      <tr>\n" +
                "        <td id=\"L1\" class=\"blob-num js-line-number\" data-line-number=\"1\"></td>\n" +
                "        <td id=\"LC1\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L2\" class=\"blob-num js-line-number\" data-line-number=\"2\"></td>\n" +
                "        <td id=\"LC2\" class=\"blob-code blob-code-inner js-file-line\">活着真正</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L3\" class=\"blob-num js-line-number\" data-line-number=\"3\"></td>\n" +
                "        <td id=\"LC3\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L4\" class=\"blob-num js-line-number\" data-line-number=\"4\"></td>\n" +
                "        <td id=\"LC4\" class=\"blob-code blob-code-inner js-file-line\">家   一内前言的作只永远只才位心写地，诉有内心为自私实他告 他，多的会真。作的高尚是他么突出、内心让他真实了了解自己了解旦了解地自己也前我一了世界。很多则就，就明白了这个原年，须是要捍辛这个原和必可期出痛卫的劳动则长时付的艰苦，因是内心并非它时刻的都为倒开的，起更多于时候敞是封闭不来，刻是只能写作，时停地写作使有使内身敞开，才能才自己置心于发现之中，就像日出的这芒照亮会黑暗来灵感光时候才了突然，到。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L5\" class=\"blob-num js-line-number\" data-line-number=\"5\"></td>\n" +
                "        <td id=\"LC5\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L6\" class=\"blob-num js-line-number\" data-line-number=\"6\"></td>\n" +
                "        <td id=\"LC6\" class=\"blob-code blob-code-inner js-file-line\">的   是期以来，现实的品一长源出于和我 沉湎都想紧张关系。我作那于紧象之中我又被现受紧层我制，，明我感实着自控的得裂粹确无法使自己自分纯，，我曾经希家变己不为一位童实实望，要成就是一者话作在在作够的拥有位，如果我能品成为这两者内的任何一个，我想我中心的是苦此会轻微得多，可痛与将同时我的力量也会削弱很多。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L7\" class=\"blob-num js-line-number\" data-line-number=\"7\"></td>\n" +
                "        <td id=\"LC7\" class=\"blob-code blob-code-inner js-file-line\">能    事实上我只</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L8\" class=\"blob-num js-line-number\" data-line-number=\"8\"></td>\n" +
                "        <td id=\"LC8\" class=\"blob-code blob-code-inner js-file-line\">成为终在这样的作家，我始现为内代的需要而写写，理智心替不了我的作作，正因为此，我在怒长冷段时间是一个愤很和一漠的作家。我</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L9\" class=\"blob-num js-line-number\" data-line-number=\"9\"></td>\n" +
                "        <td id=\"LC9\" class=\"blob-code blob-code-inner js-file-line\"> 面  困不只几</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L10\" class=\"blob-num js-line-number\" data-line-number=\"10\"></td>\n" +
                "        <td id=\"LC10\" class=\"blob-code blob-code-inner js-file-line\">个人 临的这难，是乎所有优的的作关都处于和现实秀紧张家系中，在他们笔远，只有当现实作品遥下状态时，他们处于中的现看才会闪闪发的。应虽实到满这过去亮现已该然充，魅力，可它色经蒙上了一层虚幻的实彩象那里面塞满了个人想现实个人理解。真正活，和，也就是令家生的中的现实处是作人费解和难以作，的。达</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L11\" class=\"blob-num js-line-number\" data-line-number=\"11\"></td>\n" +
                "        <td id=\"LC11\" class=\"blob-code blob-code-inner js-file-line\"> 朝 相相家要表</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L12\" class=\"blob-num js-line-number\" data-line-number=\"12\"></td>\n" +
                "        <td id=\"LC12\" class=\"blob-code blob-code-inner js-file-line\">与之 夕 处的以实，他常常而感到难实承乎，在拥说来的真现几受都蜂诉会着丑里和阴险，怪就怪事物恶，为什么丑恶的在这总是却身边，而美好的事物在远在友角和同句往说，是的海爱。换到话往只人作为情绪来情，便相反的事正则是伸手而可触及。实像一位诗人受表达的：实类无法忍所太多的真人生也在这样的作和现一的都有解决自我家，是。紧张关的，福克纳实最为一功系和的，他找他了成中温状子途事物到描写包间例美的径，，同时条容了态好的现恶放到将美国南方与丑神，他了历是和人文精实之中，这实真正意义上的着过现和，来为它连接文学去史将因成</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L13\" class=\"blob-num js-line-number\" data-line-number=\"13\"></td>\n" +
                "        <td id=\"LC13\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L14\" class=\"blob-num js-line-number\" data-line-number=\"14\"></td>\n" +
                "        <td id=\"LC14\" class=\"blob-code blob-code-inner js-file-line\">  也在描些现。功的作家笔 的写不实，可只们 下一境实说固了他是一个环现实是穿定的不死人的现样，过们看，到去是到，样他来的，也看不怎怎走走去。当他物在描我斤斤计较作人们时，写们会感到的家本人也在是斤计较，这样的作家斤在写实在的作。，而不是现实的作品品</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L15\" class=\"blob-num js-line-number\" data-line-number=\"15\"></td>\n" +
                "        <td id=\"LC15\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L16\" class=\"blob-num js-line-number\" data-line-number=\"16\"></td>\n" +
                "        <td id=\"LC16\" class=\"blob-code blob-code-inner js-file-line\"> 我  前面已经说过说 和现实关系紧张，，得严重一些度我一直是以随对的态，看待现实。敌着愤间的推移，我内心的意怒渐渐平息正我开始时识找的位真，的作家所寻到一德真理，真一种排斥道是命断的是理。不是的使判者是露泄，应家控诉或不揭发，。作里所人们展示高尚他这该向说的好尚不是那种切纯的美高，而是对一单事物理解一后的仁然，对善的恶光视同超，用同情与目之看待世界。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L17\" class=\"blob-num js-line-number\" data-line-number=\"17\"></td>\n" +
                "        <td id=\"LC17\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L18\" class=\"blob-num js-line-number\" data-line-number=\"18\"></td>\n" +
                "        <td id=\"LC18\" class=\"blob-code blob-code-inner js-file-line\">  下 正是到这样首美态 ，我听在奴一的心国民位《老奴了》，一中那歌难黑家经历了歌生的苦老，依人都好他而去，而他黑然友先地对待世界，没有一句抱动的话。这首歌深深打怨这样，我决定写下一篇《我的小说，就是苦篇的活着》力写对对这难了承受能，写人过界乐观的态度。是作活着让我明白，人，而世程本身而活着的，为不是为活着之外的任何事物所了高尚我感到。己写下活着。的作品自</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L19\" class=\"blob-num js-line-number\" data-line-number=\"19\"></td>\n" +
                "        <td id=\"LC19\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L20\" class=\"blob-num js-line-number\" data-line-number=\"20\"></td>\n" +
                "        <td id=\"LC20\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L21\" class=\"blob-num js-line-number\" data-line-number=\"21\"></td>\n" +
                "        <td id=\"LC21\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L22\" class=\"blob-num js-line-number\" data-line-number=\"22\"></td>\n" +
                "        <td id=\"LC22\" class=\"blob-code blob-code-inner js-file-line\">我第一章</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L23\" class=\"blob-num js-line-number\" data-line-number=\"23\"></td>\n" +
                "        <td id=\"LC23\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L24\" class=\"blob-num js-line-number\" data-line-number=\"24\"></td>\n" +
                "        <td id=\"LC24\" class=\"blob-code blob-code-inner js-file-line\">   时 比现在年一十岁的 闲，获业了轻乡游手好民间职谣。去个年收集候的歌得，那一间的整个的天，我游同一只乱飞夏麻雀，如荡在知了。阳喜充喝的村舍田野和我光欢斥水民那们的茶苦味的在田，他种下有我就放茶农埂拿起漆，桶毫的顾忌地的树带满茶自无茶碗舀水喝，还田里干的水壶人满，与句垢己活的男灌说上几把废话窃在笑娘因我而起的我曾私姑里扬长而瓜。窃，经聊一整守着去田午老这和了有整一个下吃，人多我位生以当瓜的得来告的一次，来我站自最是辞时妇一样发现艰己像。然，突然步位起难了个孕后我与一履门槛了祖母编女草坐为当上上一她的十月怀胎我唱了，支《着人鞋在来。我最喜欢的是傍晚》到看着坐们农民的屋前，泼，他在将提上蒸井水时在地上阳压光的腾的尘土，夕，的住芒在树梢们照过下来，拿一把他他递射来的扇子，咸尝上们和几一年咸的尝菜，男看盐个样轻女人，和看人们说头戴宽</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L25\" class=\"blob-num js-line-number\" data-line-number=\"25\"></td>\n" +
                "        <td id=\"LC25\" class=\"blob-code blob-code-inner js-file-line\">草  脚 我着话鞋边</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L26\" class=\"blob-num js-line-number\" data-line-number=\"26\"></td>\n" +
                "        <td id=\"LC26\" class=\"blob-code blob-code-inner js-file-line\">帽， 挂穿身拖。，带条毛巾上在着后的皮一上，让它像尾巴我整拍打着我的打股。似的日张大嘴巴屁着呵道上散漫地走在田间小欠，，我些拖鞋弄哒吧哒，把那仿小道吧得尘土飞过，的佛景车轮滚滚而扬时的情是。荡</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L27\" class=\"blob-num js-line-number\" data-line-number=\"27\"></td>\n" +
                "        <td id=\"LC27\" class=\"blob-code blob-code-inner js-file-line\"> 经  我楚处游村庄已 弄不清到哪些</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L28\" class=\"blob-num js-line-number\" data-line-number=\"28\"></td>\n" +
                "        <td id=\"LC28\" class=\"blob-code blob-code-inner js-file-line\">没我曾经去我走哪一我，子去过。会听近些个村有叫，常过，到孩子的喊时：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L29\" class=\"blob-num js-line-number\" data-line-number=\"29\"></td>\n" +
                "        <td id=\"LC29\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L30\" class=\"blob-num js-line-number\" data-line-number=\"30\"></td>\n" +
                "        <td id=\"LC30\" class=\"blob-code blob-code-inner js-file-line\">   又来啦个老打呵欠的人 “那。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L31\" class=\"blob-num js-line-number\" data-line-number=\"31\"></td>\n" +
                "        <td id=\"LC31\" class=\"blob-code blob-code-inner js-file-line\">就  那 于是村里人</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L32\" class=\"blob-num js-line-number\" data-line-number=\"32\"></td>\n" +
                "        <td id=\"LC32\" class=\"blob-code blob-code-inner js-file-line\">知道 的会讲来了事会实酸曲个人故事故。其唱所有的荤又们所里的酸的都是从他他那有学的兴，在知道荤们全自来曲趣是我么地方，部曾这也我什的兴趣。我然经遇到一个哭泣的老人，他鼻青眼肿悲坐在田埂上，满腹的地哀使我变得十分激动，看到为走来他我起脸哭声更他响成这仰问他是谁把他着亮。样的？他手愤挖地裤管上的他巴，指怒打告诉我是泥那为孝的儿子，当支再吾不何打他时了他我就问刻说不他楚，，儿支立吾知道清准是对我媳干了偷个摸狗的勾当。电有一鸡晚上我一着手塘赶夜路时，在打口池身旁照到了两段赤一的还面，一照压在另裸段上身体纹段着的时候两段一，手丝大动，只是有体只我在不腿灭手轻搔痒，我赶紧的上轻电离去。在农忙熄敞个大门的我走进一家喝开中午，房屋的找水一，慌个穿短裤去男人把色一张地挡住了我，神我打到井旁桶水勤随替我引上来一，殷，地屋又像耗子一样窜进了后里。这样多事我屡见的鲜，差不的和我听望着歌处一样满绿当我到不到谣都充多，一的土白时，为就会进如步明地庄稼我何长得色此旺盛。我还差  谈那个爱天</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L33\" class=\"blob-num js-line-number\" data-line-number=\"33\"></td>\n" +
                "        <td id=\"LC33\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L34\" class=\"blob-num js-line-number\" data-line-number=\"34\"></td>\n" +
                "        <td id=\"LC34\" class=\"blob-code blob-code-inner js-file-line\"> 一点 情说夏，我遇到了一位黑心悦目的女孩，她黝赏闪脸发光。我在我眼前的闪蛋至今管见到她边，她卷起裤还坐着一时的青草上，摆群在河根竹子在照看一弄七岁的鸭竿。羞个十六肥硕的女过，一怯地与我下同度孩了这个炎热的共午，深每次露出笑容时都要着深地低下头去，我看管她偷偷放下卷起的裤她，又怎样将自己的光脚个子藏到草丛里河。那丫下午我信带开外，向她的售划何口个女出又玩兜喜如，这她情孩游昂又计。我当是去心激惊。我这些感初真她实意，说只是快到和绪去一虑身心愉也，也。可考起以后会是怎样不在是后来，当她三个强壮我才的一哥走过来时，如牛吓逃跳夭我感到自己应该哥之，夭了，否则我就会不得不娶我为到。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L35\" class=\"blob-num js-line-number\" data-line-number=\"35\"></td>\n" +
                "        <td id=\"LC35\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L36\" class=\"blob-num js-line-number\" data-line-number=\"36\"></td>\n" +
                "        <td id=\"LC36\" class=\"blob-code blob-code-inner js-file-line\">    老人妻那位名叫福刚的她遇时，是夏天刚贵来到的季节。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L37\" class=\"blob-num js-line-number\" data-line-number=\"37\"></td>\n" +
                "        <td id=\"LC37\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L38\" class=\"blob-num js-line-number\" data-line-number=\"38\"></td>\n" +
                "        <td id=\"LC38\" class=\"blob-code blob-code-inner js-file-line\"> 到 一那天午茂，我叶 树下棵有里的盛树走被了 ，田着后着花已的女起正将棉包棉头巾的她人，时个秆拔出股，收们不上抖动着屁来摔下草须几的泥巴。我摘巾根帽，从身后取过毛去擦起脸上的汗下，身旁是一口在阳光水泛黄的池塘，我了靠着树干面对池感坐就下来，紧了着我在到自己要睡觉接，草塘盖草上躺下着，把就帽青住脸，枕来背包在树荫里闭上了眼比。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L39\" class=\"blob-num js-line-number\" data-line-number=\"39\"></td>\n" +
                "        <td id=\"LC39\" class=\"blob-code blob-code-inner js-file-line\">年  岁 这位睛现树</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L40\" class=\"blob-num js-line-number\" data-line-number=\"40\"></td>\n" +
                "        <td id=\"LC40\" class=\"blob-code blob-code-inner js-file-line\">轻草 中我，躺在在叶和十丛其间，几了两个小到。的间有睡只蚂蚁爬时的手的腿上准确沉睡它们弹走依然，我地将来了我指。后来仿佛人撑到竹水边，一位老是吆着。筏从远处响亮地而出了吆喝声在现挣脱中喝，我在睡梦里身后清晰地传来，我起实老，看到开旁田头一个里人正在近导一里老牛老</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L41\" class=\"blob-num js-line-number\" data-line-number=\"41\"></td>\n" +
                "        <td id=\"LC41\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L42\" class=\"blob-num js-line-number\" data-line-number=\"42\"></td>\n" +
                "        <td id=\"LC42\" class=\"blob-code blob-code-inner js-file-line\">    犁田的。牛或许已经深那疲倦，它低裸伫立在感犁，后面赤头着脊的扶里的老人，对老牛背消极态度似乎不满，牛听到他嗓音响亮地对我说牛：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L43\" class=\"blob-num js-line-number\" data-line-number=\"43\"></td>\n" +
                "        <td id=\"LC43\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L44\" class=\"blob-num js-line-number\" data-line-number=\"44\"></td>\n" +
                "        <td id=\"LC44\" class=\"blob-code blob-code-inner js-file-line\">做   “做和耕化， 做鸡家，做道女田缘，狗看报晓不耕尚人织布，哪只就，做田？这可呀自古牛有的道理，走是，走倦。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L45\" class=\"blob-num js-line-number\" data-line-number=\"45\"></td>\n" +
                "        <td id=\"LC45\" class=\"blob-code blob-code-inner js-file-line\">听    疲呀的老牛佛到老人的吆起后，仿</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L46\" class=\"blob-num js-line-number\" data-line-number=\"46\"></td>\n" +
                "        <td id=\"LC46\" class=\"blob-code blob-code-inner js-file-line\">知犁往前走喝了头，拉着错般地抬到。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L47\" class=\"blob-num js-line-number\" data-line-number=\"47\"></td>\n" +
                "        <td id=\"LC47\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L48\" class=\"blob-num js-line-number\" data-line-number=\"48\"></td>\n" +
                "        <td id=\"LC48\" class=\"blob-code blob-code-inner js-file-line\">脊   我一去老人的 个和牛背看的黝黑，那背古板垂暮样耕命将两块动入犹田地生得哗哗翻进，的如水面上掀起的波浪我听</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L49\" class=\"blob-num js-line-number\" data-line-number=\"49\"></td>\n" +
                "        <td id=\"LC49\" class=\"blob-code blob-code-inner js-file-line\"> 人  随令，。动到老音粗哑却后人感</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L50\" class=\"blob-num js-line-number\" data-line-number=\"50\"></td>\n" +
                "        <td id=\"LC50\" class=\"blob-code blob-code-inner js-file-line\">的嗓谣，他唱起了旧日的歌 ，先是引子呀接呀唱出长长的词依，啦着出现两句歌口—我</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L51\" class=\"blob-num js-line-number\" data-line-number=\"51\"></td>\n" +
                "        <td id=\"LC51\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L52\" class=\"blob-num js-line-number\" data-line-number=\"52\"></td>\n" +
                "        <td id=\"LC52\" class=\"blob-code blob-code-inner js-file-line\">婿   皇迢招—去女 ，路远迢帝因不路。遥</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L53\" class=\"blob-num js-line-number\" data-line-number=\"53\"></td>\n" +
                "        <td id=\"LC53\" class=\"blob-code blob-code-inner js-file-line\">  愿去我为做途</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L54\" class=\"blob-num js-line-number\" data-line-number=\"54\"></td>\n" +
                "        <td id=\"LC54\" class=\"blob-code blob-code-inner js-file-line\">远，不  做鸣帝的女婿。声而的自可得意让我失老人笑。老能是牛放慢了脚步，皇人又吆“起来：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L55\" class=\"blob-num js-line-number\" data-line-number=\"55\"></td>\n" +
                "        <td id=\"LC55\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L56\" class=\"blob-num js-line-number\" data-line-number=\"56\"></td>\n" +
                "        <td id=\"LC56\" class=\"blob-code blob-code-inner js-file-line\">    喝二喜，有庆不要好懒；家珍，啊。耕得偷；苦根也行凤霞”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L57\" class=\"blob-num js-line-number\" data-line-number=\"57\"></td>\n" +
                "        <td id=\"LC57\" class=\"blob-code blob-code-inner js-file-line\">有  多 一头牛竟会</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L58\" class=\"blob-num js-line-number\" data-line-number=\"58\"></td>\n" +
                "        <td id=\"LC58\" class=\"blob-code blob-code-inner js-file-line\">走么 名字问我好的地人到田边，？走近奇老这有多</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L59\" class=\"blob-num js-line-number\" data-line-number=\"59\"></td>\n" +
                "        <td id=\"LC59\" class=\"blob-code blob-code-inner js-file-line\">    “这牛：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L60\" class=\"blob-num js-line-number\" data-line-number=\"60\"></td>\n" +
                "        <td id=\"LC60\" class=\"blob-code blob-code-inner js-file-line\">少名字？”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L61\" class=\"blob-num js-line-number\" data-line-number=\"61\"></td>\n" +
                "        <td id=\"LC61\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L62\" class=\"blob-num js-line-number\" data-line-number=\"62\"></td>\n" +
                "        <td id=\"LC62\" class=\"blob-code blob-code-inner js-file-line\">    老人扶住犁量一来，问将我上下打站下番后他：里人吧   “你是城</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L63\" class=\"blob-num js-line-number\" data-line-number=\"63\"></td>\n" +
                "        <td id=\"LC63\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L64\" class=\"blob-num js-line-number\" data-line-number=\"64\"></td>\n" +
                "        <td id=\"LC64\" class=\"blob-code blob-code-inner js-file-line\"> ？”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L65\" class=\"blob-num js-line-number\" data-line-number=\"65\"></td>\n" +
                "        <td id=\"LC65\" class=\"blob-code blob-code-inner js-file-line\">我点   “是的。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L66\" class=\"blob-num js-line-number\" data-line-number=\"66\"></td>\n" +
                "        <td id=\"LC66\" class=\"blob-code blob-code-inner js-file-line\"> 人头意</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L67\" class=\"blob-num js-line-number\" data-line-number=\"67\"></td>\n" +
                "        <td id=\"LC67\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L68\" class=\"blob-num js-line-number\" data-line-number=\"68\"></td>\n" +
                "        <td id=\"LC68\" class=\"blob-code blob-code-inner js-file-line\">    老点得。起来，“我一眼就看出来了。“</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L69\" class=\"blob-num js-line-number\" data-line-number=\"69\"></td>\n" +
                "        <td id=\"LC69\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L70\" class=\"blob-num js-line-number\" data-line-number=\"70\"></td>\n" +
                "        <td id=\"LC70\" class=\"blob-code blob-code-inner js-file-line\">究   我说字””牛 竟有多少名人？答</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L71\" class=\"blob-num js-line-number\" data-line-number=\"71\"></td>\n" +
                "        <td id=\"LC71\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L72\" class=\"blob-num js-line-number\" data-line-number=\"72\"></td>\n" +
                "        <td id=\"LC72\" class=\"blob-code blob-code-inner js-file-line\"> 牛 福老：就这：“字 叫 贵，回一个名这。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L73\" class=\"blob-num js-line-number\" data-line-number=\"73\"></td>\n" +
                "        <td id=\"LC73\" class=\"blob-code blob-code-inner js-file-line\">叫    字可你刚才</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L74\" class=\"blob-num js-line-number\" data-line-number=\"74\"></td>\n" +
                "        <td id=\"LC74\" class=\"blob-code blob-code-inner js-file-line\">了几个““。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L75\" class=\"blob-num js-line-number\" data-line-number=\"75\"></td>\n" +
                "        <td id=\"LC75\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L76\" class=\"blob-num js-line-number\" data-line-number=\"76\"></td>\n" +
                "        <td id=\"LC76\" class=\"blob-code blob-code-inner js-file-line\">   地名噢——”老人高兴我笑起来，他神秘地向 招招手，当我凑过去时，他欲说又止就他看到牛正抬着头，，训斥它偷听</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L77\" class=\"blob-num js-line-number\" data-line-number=\"77\"></td>\n" +
                "        <td id=\"LC77\" class=\"blob-code blob-code-inner js-file-line\">   下“你别：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L78\" class=\"blob-num js-line-number\" data-line-number=\"78\"></td>\n" +
                "        <td id=\"LC78\" class=\"blob-code blob-code-inner js-file-line\">，把头牛 然”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L79\" class=\"blob-num js-line-number\" data-line-number=\"79\"></td>\n" +
                "        <td id=\"LC79\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L80\" class=\"blob-num js-line-number\" data-line-number=\"80\"></td>\n" +
                "        <td id=\"LC80\" class=\"blob-code blob-code-inner js-file-line\">    老人。声下了头，这时低果悄低对我说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L81\" class=\"blob-num js-line-number\" data-line-number=\"81\"></td>\n" +
                "        <td id=\"LC81\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L82\" class=\"blob-num js-line-number\" data-line-number=\"82\"></td>\n" +
                "        <td id=\"LC82\" class=\"blob-code blob-code-inner js-file-line\">    “我田它知多只有自己在字怕骗就道叫出几个名耕去牛它，它听到还有别的，兴在耕田也就不会不高也，耕田，就起劲人。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L83\" class=\"blob-num js-line-number\" data-line-number=\"83\"></td>\n" +
                "        <td id=\"LC83\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L84\" class=\"blob-num js-line-number\" data-line-number=\"84\"></td>\n" +
                "        <td id=\"LC84\" class=\"blob-code blob-code-inner js-file-line\">在   老啦黝黑的脸 阳光里笑得十分生动动脸上的皱纹满乐地游，着，布面镶欢了泥土，就如里满田间的小道。后</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L85\" class=\"blob-num js-line-number\" data-line-number=\"85\"></td>\n" +
                "        <td id=\"LC85\" class=\"blob-code blob-code-inner js-file-line\">    这位了那</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L86\" class=\"blob-num js-line-number\" data-line-number=\"86\"></td>\n" +
                "        <td id=\"LC86\" class=\"blob-code blob-code-inner js-file-line\">来和我一起坐在老人棵茂盛的树下，在他个充讲阳光的下午，那向我满述了自己。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L87\" class=\"blob-num js-line-number\" data-line-number=\"87\"></td>\n" +
                "        <td id=\"LC87\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L88\" class=\"blob-num js-line-number\" data-line-number=\"88\"></td>\n" +
                "        <td id=\"LC88\" class=\"blob-code blob-code-inner js-file-line\">    四十多年前去我爹常在一里黑来走，绸他穿总这身走颜色的，衣，着是门双手背在身后，他出把时常对我娘说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L89\" class=\"blob-num js-line-number\" data-line-number=\"89\"></td>\n" +
                "        <td id=\"LC89\" class=\"blob-code blob-code-inner js-file-line\">的    “我”自己</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L90\" class=\"blob-num js-line-number\" data-line-number=\"90\"></td>\n" +
                "        <td id=\"LC90\" class=\"blob-code blob-code-inner js-file-line\">地上去我走。到</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L91\" class=\"blob-num js-line-number\" data-line-number=\"91\"></td>\n" +
                "        <td id=\"LC91\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L92\" class=\"blob-num js-line-number\" data-line-number=\"92\"></td>\n" +
                "        <td id=\"LC92\" class=\"blob-code blob-code-inner js-file-line\">  产上走爹走的佃己的田  ，干活在自锄见恭，都要一声握住户头了敬地叫双手：”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L93\" class=\"blob-num js-line-number\" data-line-number=\"93\"></td>\n" +
                "        <td id=\"LC93\" class=\"blob-code blob-code-inner js-file-line\">    “老爷走</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L94\" class=\"blob-num js-line-number\" data-line-number=\"94\"></td>\n" +
                "        <td id=\"LC94\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L95\" class=\"blob-num js-line-number\" data-line-number=\"95\"></td>\n" +
                "        <td id=\"LC95\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L96\" class=\"blob-num js-line-number\" data-line-number=\"96\"></td>\n" +
                "        <td id=\"LC96\" class=\"blob-code blob-code-inner js-file-line\">    我爹了到了城里，城里人见。有叫份先生。我爹是很都身他个人，了他拉屎时就像里穷人可。他不爱在屋的牲边似马桶上到屎地里床拉屎。喜欢拉了，跟去畜的的我天打野傍晚的时候，和爹到着饱嗝，那声响每屋蛙叫唤差不多，走出青去，走吞。地朝村口的粪走到去粪</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L97\" class=\"blob-num js-line-number\" data-line-number=\"97\"></td>\n" +
                "        <td id=\"LC97\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L98\" class=\"blob-num js-line-number\" data-line-number=\"98\"></td>\n" +
                "        <td id=\"LC98\" class=\"blob-code blob-code-inner js-file-line\">    沿脏了吞缸脚踩上嫌缸缸慢，就抬爹，他去蹲在上面。我旁年纪大来，容也跟着老了，出了家屎易会听时候我们全嗷嗷叫，那到他在村口不人十着。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L99\" class=\"blob-num js-line-number\" data-line-number=\"99\"></td>\n" +
                "        <td id=\"LC99\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L100\" class=\"blob-num js-line-number\" data-line-number=\"100\"></td>\n" +
                "        <td id=\"LC100\" class=\"blob-code blob-code-inner js-file-line\">   样拉都年来我六一直这 能屎，到了爹十多岁还晌在那缸上一蹲就是半几样粪两。腿就和欢爪一，有慢条我下来鸟看着天的田慢黑爹喜，罩住他色三地。我女常凤霞到了劲、四岁，儿跑到村口毕看她纪大拉屎，我爹去竟年有爷了嗦蹲凤粪缸上腿爷些哆，，在霞就爷他：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L101\" class=\"blob-num js-line-number\" data-line-number=\"101\"></td>\n" +
                "        <td id=\"LC101\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L102\" class=\"blob-num js-line-number\" data-line-number=\"102\"></td>\n" +
                "        <td id=\"LC102\" class=\"blob-code blob-code-inner js-file-line\">    “”爷，你为什么动呀？问</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L103\" class=\"blob-num js-line-number\" data-line-number=\"103\"></td>\n" +
                "        <td id=\"LC103\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L104\" class=\"blob-num js-line-number\" data-line-number=\"104\"></td>\n" +
                "        <td id=\"LC104\" class=\"blob-code blob-code-inner js-file-line\">  的。我爹说：“是风那  ”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L105\" class=\"blob-num js-line-number\" data-line-number=\"105\"></td>\n" +
                "        <td id=\"LC105\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L106\" class=\"blob-num js-line-number\" data-line-number=\"106\"></td>\n" +
                "        <td id=\"LC106\" class=\"blob-code blob-code-inner js-file-line\">    吹时候我们徐境还没有败落地我们家家有一百多边，，从这囱一直到那亩工厂的烟和，都是我家闻名我爹老我，阔远近的。的阔路爷和是少爷响我都走里铜鞋子来声，，们像是时钱碰的撞去里。我女人家珍儿是她的米行老板的女生的城也钱有钱人家出人，。是是人嫁给有钱，，钱上把哗堆地来，这在就有面钱哗起流年钱有的声音我有四十，没样听到了。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L107\" class=\"blob-num js-line-number\" data-line-number=\"107\"></td>\n" +
                "        <td id=\"LC107\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L108\" class=\"blob-num js-line-number\" data-line-number=\"108\"></td>\n" +
                "        <td id=\"LC108\" class=\"blob-code blob-code-inner js-file-line\">    我是我们徐家的败家子，用孽爹的话说，我是他的我子。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L109\" class=\"blob-num js-line-number\" data-line-number=\"109\"></td>\n" +
                "        <td id=\"LC109\" class=\"blob-code blob-code-inner js-file-line\">私   长衫念过几年</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L110\" class=\"blob-num js-line-number\" data-line-number=\"110\"></td>\n" +
                "        <td id=\"LC110\" class=\"blob-code blob-code-inner js-file-line\">塾，穿 我书私塾是生叫高念一段我站起先我最着本的。的时，字，拿我兴线装先生千来文》，对私塾的《说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L111\" class=\"blob-num js-line-number\" data-line-number=\"111\"></td>\n" +
                "        <td id=\"LC111\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L112\" class=\"blob-num js-line-number\" data-line-number=\"112\"></td>\n" +
                "        <td id=\"LC112\" class=\"blob-code blob-code-inner js-file-line\">  你 “好好听着，爹给 念一段花”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L113\" class=\"blob-num js-line-number\" data-line-number=\"113\"></td>\n" +
                "        <td id=\"LC113\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L114\" class=\"blob-num js-line-number\" data-line-number=\"114\"></td>\n" +
                "        <td id=\"LC114\" class=\"blob-code blob-code-inner js-file-line\">    年过。甲的私塾先生对我爹说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L115\" class=\"blob-num js-line-number\" data-line-number=\"115\"></td>\n" +
                "        <td id=\"LC115\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L116\" class=\"blob-num js-line-number\" data-line-number=\"116\"></td>\n" +
                "        <td id=\"LC116\" class=\"blob-code blob-code-inner js-file-line\"> 了 能“你家少子长大 准 当个二我从。就不</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L117\" class=\"blob-num js-line-number\" data-line-number=\"117\"></td>\n" +
                "        <td id=\"LC117\" class=\"blob-code blob-code-inner js-file-line\">救   流爷小”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L118\" class=\"blob-num js-line-number\" data-line-number=\"118\"></td>\n" +
                "        <td id=\"LC118\" class=\"blob-code blob-code-inner js-file-line\">。私药，这是我爹的话不 塾也。现我是朽木可可雕先生说在想想他们这说对了我当初我可呵都么是，，想我的钱不，我想徐家是灭有一徐香火得我要绝有了，根家就，断子仅孙。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L119\" class=\"blob-num js-line-number\" data-line-number=\"119\"></td>\n" +
                "        <td id=\"LC119\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L120\" class=\"blob-num js-line-number\" data-line-number=\"120\"></td>\n" +
                "        <td id=\"LC120\" class=\"blob-code blob-code-inner js-file-line\">来  路上都塾时我从 不走 ，私是我家一个雇工经着我去，放学时他已那恭了敬敬地弯腰蹲在背里工的我骑上去后拍拍雇恭，脑袋，说一声：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L121\" class=\"blob-num js-line-number\" data-line-number=\"121\"></td>\n" +
                "        <td id=\"LC121\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L122\" class=\"blob-num js-line-number\" data-line-number=\"122\"></td>\n" +
                "        <td id=\"LC122\" class=\"blob-code blob-code-inner js-file-line\">    “长根，跑呀长”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L123\" class=\"blob-num js-line-number\" data-line-number=\"123\"></td>\n" +
                "        <td id=\"LC123\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L124\" class=\"blob-num js-line-number\" data-line-number=\"124\"></td>\n" +
                "        <td id=\"LC124\" class=\"blob-code blob-code-inner js-file-line\">    雇工。根就跑起来，我在上面在颠一颠的，像是一说一声梢上的麻雀。我只一呀：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L125\" class=\"blob-num js-line-number\" data-line-number=\"125\"></td>\n" +
                "        <td id=\"LC125\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L126\" class=\"blob-num js-line-number\" data-line-number=\"126\"></td>\n" +
                "        <td id=\"LC126\" class=\"blob-code blob-code-inner js-file-line\">    “长树。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L127\" class=\"blob-num js-line-number\" data-line-number=\"127\"></td>\n" +
                "        <td id=\"LC127\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L128\" class=\"blob-num js-line-number\" data-line-number=\"128\"></td>\n" +
                "        <td id=\"LC128\" class=\"blob-code blob-code-inner js-file-line\">跳   飞根就一样一。，做出一副飞的步子 </td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L129\" class=\"blob-num js-line-number\" data-line-number=\"129\"></td>\n" +
                "        <td id=\"LC129\" class=\"blob-code blob-code-inner js-file-line\">喜  城 我长常以后</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L130\" class=\"blob-num js-line-number\" data-line-number=\"130\"></td>\n" +
                "        <td id=\"LC130\" class=\"blob-code blob-code-inner js-file-line\">天往 不跑，大常穿十欢色的里回家衫我是着白半光丝绸衣。，头发抹一月滑透亮，往镜子脑得站黑我看到一己满前袋的，油漆，自副有钱人的样子。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L131\" class=\"blob-num js-line-number\" data-line-number=\"131\"></td>\n" +
                "        <td id=\"LC131\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L132\" class=\"blob-num js-line-number\" data-line-number=\"132\"></td>\n" +
                "        <td id=\"LC132\" class=\"blob-code blob-code-inner js-file-line\">    我爱往妓院整夜听那些风骚的女哈钻，叽些喳喳和哼哼人哈，那叽声音听上去像是在给我挠痒痒。做人呵，一旦嫖上以后这也就免赌了要像是胳，个嫖和不在就去赌。膊和肩膀连，一来，怎喜都分不开。后起我更么欢赌博了，嫖妓只是为多了松去下，一跟水喝了说要一方便就下。样博轻白了就是撒尿一赌，就完全不纸粽了，*沂歉滞*张一有牛乇鹗悄怯鼋出煊，样一股叫我说不纯来的和坦。以前我是过一天舒尚撞一天钟，整天有气无力，每天早晨醒来犯愁的就是这一天该怎么打发。我爹常常唉声叹气，训斥我没有光耀祖宗。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L133\" class=\"blob-num js-line-number\" data-line-number=\"133\"></td>\n" +
                "        <td id=\"LC133\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L134\" class=\"blob-num js-line-number\" data-line-number=\"134\"></td>\n" +
                "        <td id=\"LC134\" class=\"blob-code blob-code-inner js-file-line\">    我心想光耀祖宗也不是非我莫属，我对自己说：“凭什么让我放着好端端的日子不过，去想光耀祖宗这些累人的事。再说我爹年轻时也和我一样，我家祖上有两百多亩地，到他手上一折腾就剩一百多亩了。我对爹说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L135\" class=\"blob-num js-line-number\" data-line-number=\"135\"></td>\n" +
                "        <td id=\"LC135\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L136\" class=\"blob-num js-line-number\" data-line-number=\"136\"></td>\n" +
                "        <td id=\"LC136\" class=\"blob-code blob-code-inner js-file-line\">    “你别犯愁啦，我儿子会光耀祖宗的。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L137\" class=\"blob-num js-line-number\" data-line-number=\"137\"></td>\n" +
                "        <td id=\"LC137\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L138\" class=\"blob-num js-line-number\" data-line-number=\"138\"></td>\n" +
                "        <td id=\"LC138\" class=\"blob-code blob-code-inner js-file-line\">    总该给下一辈留点好事吧。我娘听了这话吃吃笑，她偷偷告诉我：“我爹年轻时也这么对我爷爷说过。我心想就是嘛，他自己干不了的事硬要我来干，我怎么会答应。那时候我儿子有庆还没出来，我女儿凤霞刚好四岁。家珍怀着有庆有六个月了，自然有些难看，走路时裤裆里像是夹了个馒头似的一撇一撇，两只脚不往前往横里跨，我嫌弃她，对她说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L139\" class=\"blob-num js-line-number\" data-line-number=\"139\"></td>\n" +
                "        <td id=\"LC139\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L140\" class=\"blob-num js-line-number\" data-line-number=\"140\"></td>\n" +
                "        <td id=\"LC140\" class=\"blob-code blob-code-inner js-file-line\">    “你呀，风一吹肚子就要大上一圈。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L141\" class=\"blob-num js-line-number\" data-line-number=\"141\"></td>\n" +
                "        <td id=\"LC141\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L142\" class=\"blob-num js-line-number\" data-line-number=\"142\"></td>\n" +
                "        <td id=\"LC142\" class=\"blob-code blob-code-inner js-file-line\">    家珍从不顶撞我，听了这糟蹋她的话，她心里不乐意也只是轻轻说一句：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L143\" class=\"blob-num js-line-number\" data-line-number=\"143\"></td>\n" +
                "        <td id=\"LC143\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L144\" class=\"blob-num js-line-number\" data-line-number=\"144\"></td>\n" +
                "        <td id=\"LC144\" class=\"blob-code blob-code-inner js-file-line\">    “又不是风吹大的。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L145\" class=\"blob-num js-line-number\" data-line-number=\"145\"></td>\n" +
                "        <td id=\"LC145\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L146\" class=\"blob-num js-line-number\" data-line-number=\"146\"></td>\n" +
                "        <td id=\"LC146\" class=\"blob-code blob-code-inner js-file-line\">    自从我赌博上以后，我倒还真想光耀祖宗了，想把我爹弄掉的一百多亩地挣回来。那些日子爹问我在城里鬼混些什么，我对他说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L147\" class=\"blob-num js-line-number\" data-line-number=\"147\"></td>\n" +
                "        <td id=\"LC147\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L148\" class=\"blob-num js-line-number\" data-line-number=\"148\"></td>\n" +
                "        <td id=\"LC148\" class=\"blob-code blob-code-inner js-file-line\">    “现在不鬼混啦，我在做生意。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L149\" class=\"blob-num js-line-number\" data-line-number=\"149\"></td>\n" +
                "        <td id=\"LC149\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L150\" class=\"blob-num js-line-number\" data-line-number=\"150\"></td>\n" +
                "        <td id=\"LC150\" class=\"blob-code blob-code-inner js-file-line\">    他问：“做什么生意？”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L151\" class=\"blob-num js-line-number\" data-line-number=\"151\"></td>\n" +
                "        <td id=\"LC151\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L152\" class=\"blob-num js-line-number\" data-line-number=\"152\"></td>\n" +
                "        <td id=\"LC152\" class=\"blob-code blob-code-inner js-file-line\">    他一听就火了，他年轻时也这么回答过我爷爷。他知道我是在赌博，脱下布鞋就朝我打来，我左躲右藏，心想他打几下就该完了吧。可我这个平常只有咳嗽才有力气的爹，竟然越打越凶了。我又不是一只苍蝇，让他这么拍来拍去。我一把捏住他的手，说道：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L153\" class=\"blob-num js-line-number\" data-line-number=\"153\"></td>\n" +
                "        <td id=\"LC153\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L154\" class=\"blob-num js-line-number\" data-line-number=\"154\"></td>\n" +
                "        <td id=\"LC154\" class=\"blob-code blob-code-inner js-file-line\">    “爹，你他娘的算了吧。老子看在你把我弄出来的份上让让你，你他娘的就算了吧。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L155\" class=\"blob-num js-line-number\" data-line-number=\"155\"></td>\n" +
                "        <td id=\"LC155\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L156\" class=\"blob-num js-line-number\" data-line-number=\"156\"></td>\n" +
                "        <td id=\"LC156\" class=\"blob-code blob-code-inner js-file-line\">    我捏住爹的右手，他又用左手脱下右脚的布鞋，还想打我。我又捏住他的左手，这样他就动弹不得了，他气得哆嗦了半晌，才喊出一声：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L157\" class=\"blob-num js-line-number\" data-line-number=\"157\"></td>\n" +
                "        <td id=\"LC157\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L158\" class=\"blob-num js-line-number\" data-line-number=\"158\"></td>\n" +
                "        <td id=\"LC158\" class=\"blob-code blob-code-inner js-file-line\">    “孽子。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L159\" class=\"blob-num js-line-number\" data-line-number=\"159\"></td>\n" +
                "        <td id=\"LC159\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L160\" class=\"blob-num js-line-number\" data-line-number=\"160\"></td>\n" +
                "        <td id=\"LC160\" class=\"blob-code blob-code-inner js-file-line\">    我说：“去你娘的。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L161\" class=\"blob-num js-line-number\" data-line-number=\"161\"></td>\n" +
                "        <td id=\"LC161\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L162\" class=\"blob-num js-line-number\" data-line-number=\"162\"></td>\n" +
                "        <td id=\"LC162\" class=\"blob-code blob-code-inner js-file-line\">    双手一推，他就跌坐到墙角里去了。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L163\" class=\"blob-num js-line-number\" data-line-number=\"163\"></td>\n" +
                "        <td id=\"LC163\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L164\" class=\"blob-num js-line-number\" data-line-number=\"164\"></td>\n" +
                "        <td id=\"LC164\" class=\"blob-code blob-code-inner js-file-line\">    我年轻时吃喝嫖赌，什么浪荡的事都干过。我常去的那家妓院是单名，叫青楼。里面有个胖胖的妓女很招我喜爱，她走路时两片大屁股就像挂在楼前的两只灯笼，晃来晃去。她躺到床上一动一动时，压在上面的我就像睡在船上，在河水里摇呀摇呀。我经常让她背着我去逛街，我骑在她身上像是骑在一匹马上。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L165\" class=\"blob-num js-line-number\" data-line-number=\"165\"></td>\n" +
                "        <td id=\"LC165\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L166\" class=\"blob-num js-line-number\" data-line-number=\"166\"></td>\n" +
                "        <td id=\"LC166\" class=\"blob-code blob-code-inner js-file-line\">    我的丈人，米行的陈老板，穿着黑色的绸衫站在柜台后面。我每次从那里经过时，都要揪住妓女的头发，让她停下，脱帽向丈人致礼：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L167\" class=\"blob-num js-line-number\" data-line-number=\"167\"></td>\n" +
                "        <td id=\"LC167\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L168\" class=\"blob-num js-line-number\" data-line-number=\"168\"></td>\n" +
                "        <td id=\"LC168\" class=\"blob-code blob-code-inner js-file-line\">    “近来无恙？”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L169\" class=\"blob-num js-line-number\" data-line-number=\"169\"></td>\n" +
                "        <td id=\"LC169\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L170\" class=\"blob-num js-line-number\" data-line-number=\"170\"></td>\n" +
                "        <td id=\"LC170\" class=\"blob-code blob-code-inner js-file-line\">    我丈人当时的脸就和松花蛋一样，我呢，嘻嘻笑着过去了。后来我爹说我丈人几次都让我气病了，我对爹说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L171\" class=\"blob-num js-line-number\" data-line-number=\"171\"></td>\n" +
                "        <td id=\"LC171\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L172\" class=\"blob-num js-line-number\" data-line-number=\"172\"></td>\n" +
                "        <td id=\"LC172\" class=\"blob-code blob-code-inner js-file-line\">    “别哄我啦，你是我爹都没气成病。他自己生病凭什么往我身上推？”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L173\" class=\"blob-num js-line-number\" data-line-number=\"173\"></td>\n" +
                "        <td id=\"LC173\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L174\" class=\"blob-num js-line-number\" data-line-number=\"174\"></td>\n" +
                "        <td id=\"LC174\" class=\"blob-code blob-code-inner js-file-line\">    他怕我，我倒是知道的。我骑在妓女身上经过他的店门时，我丈人身手极快，像只耗子呼地一下窜到里屋去了。他不敢见我，可当女婿的路过丈人店门总该有个礼吧。我就大声嚷嚷着向逃窜的丈人请安。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L175\" class=\"blob-num js-line-number\" data-line-number=\"175\"></td>\n" +
                "        <td id=\"LC175\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L176\" class=\"blob-num js-line-number\" data-line-number=\"176\"></td>\n" +
                "        <td id=\"LC176\" class=\"blob-code blob-code-inner js-file-line\">    最风光的那次是小日本投降后，国军准备进城收复失地。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L177\" class=\"blob-num js-line-number\" data-line-number=\"177\"></td>\n" +
                "        <td id=\"LC177\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L178\" class=\"blob-num js-line-number\" data-line-number=\"178\"></td>\n" +
                "        <td id=\"LC178\" class=\"blob-code blob-code-inner js-file-line\">    那天可真是热闹，城里街道两旁站满了人，手里拿着小彩旗，商店都斜着插出来青天白日旗，我丈人米行前还挂了一幅两扇门板那么大的蒋介石像，米行的三个伙计都站在蒋介石左边的口袋下。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L179\" class=\"blob-num js-line-number\" data-line-number=\"179\"></td>\n" +
                "        <td id=\"LC179\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L180\" class=\"blob-num js-line-number\" data-line-number=\"180\"></td>\n" +
                "        <td id=\"LC180\" class=\"blob-code blob-code-inner js-file-line\">    那天我在青楼里赌了一夜，脑袋昏昏沉沉像是肩膀上扛了一袋米，我想着自己有半个来月没回家了，身上的衣服一股酸臭味，我就把那个胖大妓女从床上拖起来，让她背着我回家，叫了抬轿子跟在后面，我到了家好让她坐轿子回青楼。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L181\" class=\"blob-num js-line-number\" data-line-number=\"181\"></td>\n" +
                "        <td id=\"LC181\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L182\" class=\"blob-num js-line-number\" data-line-number=\"182\"></td>\n" +
                "        <td id=\"LC182\" class=\"blob-code blob-code-inner js-file-line\">    那妓女嘟嘟哝哝背着我往城门走，说什么雷公不打睡觉人，才睡下就被我叫醒，说我心肠黑。我把一个银元往她胸口灌进去，就把她的嘴堵上了。走近了城门，一看到两旁站了那么多人，我的精神一下子上来了。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L183\" class=\"blob-num js-line-number\" data-line-number=\"183\"></td>\n" +
                "        <td id=\"LC183\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L184\" class=\"blob-num js-line-number\" data-line-number=\"184\"></td>\n" +
                "        <td id=\"LC184\" class=\"blob-code blob-code-inner js-file-line\">    我丈人是城里商会的会长，我很远就看到他站在街道中央喊：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L185\" class=\"blob-num js-line-number\" data-line-number=\"185\"></td>\n" +
                "        <td id=\"LC185\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L186\" class=\"blob-num js-line-number\" data-line-number=\"186\"></td>\n" +
                "        <td id=\"LC186\" class=\"blob-code blob-code-inner js-file-line\">    “都站好了，都站好了，等国军一到，大家都要拍手，都要喊。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L187\" class=\"blob-num js-line-number\" data-line-number=\"187\"></td>\n" +
                "        <td id=\"LC187\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L188\" class=\"blob-num js-line-number\" data-line-number=\"188\"></td>\n" +
                "        <td id=\"LC188\" class=\"blob-code blob-code-inner js-file-line\">    有人看到了我，就嘻嘻笑着喊：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L189\" class=\"blob-num js-line-number\" data-line-number=\"189\"></td>\n" +
                "        <td id=\"LC189\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L190\" class=\"blob-num js-line-number\" data-line-number=\"190\"></td>\n" +
                "        <td id=\"LC190\" class=\"blob-code blob-code-inner js-file-line\">    “来啦，来啦。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L191\" class=\"blob-num js-line-number\" data-line-number=\"191\"></td>\n" +
                "        <td id=\"LC191\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L192\" class=\"blob-num js-line-number\" data-line-number=\"192\"></td>\n" +
                "        <td id=\"LC192\" class=\"blob-code blob-code-inner js-file-line\">    我丈人还以为是国军来了，赶紧闪到一旁。我两条腿像是夹马似的夹了夹妓女，对她说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L193\" class=\"blob-num js-line-number\" data-line-number=\"193\"></td>\n" +
                "        <td id=\"LC193\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L194\" class=\"blob-num js-line-number\" data-line-number=\"194\"></td>\n" +
                "        <td id=\"LC194\" class=\"blob-code blob-code-inner js-file-line\">    “跑呀，跑呀。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L195\" class=\"blob-num js-line-number\" data-line-number=\"195\"></td>\n" +
                "        <td id=\"LC195\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L196\" class=\"blob-num js-line-number\" data-line-number=\"196\"></td>\n" +
                "        <td id=\"LC196\" class=\"blob-code blob-code-inner js-file-line\">    在两旁人群的哄笑里，妓女呼哧呼哧背着我小跑起来，嘴里骂道：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L197\" class=\"blob-num js-line-number\" data-line-number=\"197\"></td>\n" +
                "        <td id=\"LC197\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L198\" class=\"blob-num js-line-number\" data-line-number=\"198\"></td>\n" +
                "        <td id=\"LC198\" class=\"blob-code blob-code-inner js-file-line\">    “夜里压我，白天骑我，黑心肠的，你是逼我往死里跑。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L199\" class=\"blob-num js-line-number\" data-line-number=\"199\"></td>\n" +
                "        <td id=\"LC199\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L200\" class=\"blob-num js-line-number\" data-line-number=\"200\"></td>\n" +
                "        <td id=\"LC200\" class=\"blob-code blob-code-inner js-file-line\">    我咧着嘴频频向两旁哄笑的人点头致礼，来到丈人近前，我一把扯住妓女的头发：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L201\" class=\"blob-num js-line-number\" data-line-number=\"201\"></td>\n" +
                "        <td id=\"LC201\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L202\" class=\"blob-num js-line-number\" data-line-number=\"202\"></td>\n" +
                "        <td id=\"LC202\" class=\"blob-code blob-code-inner js-file-line\">    “站住，站住。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L203\" class=\"blob-num js-line-number\" data-line-number=\"203\"></td>\n" +
                "        <td id=\"LC203\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L204\" class=\"blob-num js-line-number\" data-line-number=\"204\"></td>\n" +
                "        <td id=\"LC204\" class=\"blob-code blob-code-inner js-file-line\">    妓女哎唷叫了一声站住脚，我大声对丈人说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L205\" class=\"blob-num js-line-number\" data-line-number=\"205\"></td>\n" +
                "        <td id=\"LC205\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L206\" class=\"blob-num js-line-number\" data-line-number=\"206\"></td>\n" +
                "        <td id=\"LC206\" class=\"blob-code blob-code-inner js-file-line\">    “岳父大人，女婿给你请个早安。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L207\" class=\"blob-num js-line-number\" data-line-number=\"207\"></td>\n" +
                "        <td id=\"LC207\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L208\" class=\"blob-num js-line-number\" data-line-number=\"208\"></td>\n" +
                "        <td id=\"LC208\" class=\"blob-code blob-code-inner js-file-line\">    那次我实实在在地把我丈人的脸丢尽了，我丈人当时傻站在那里，嘴唇一个劲地哆嗦，半晌才沙哑地说一声：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L209\" class=\"blob-num js-line-number\" data-line-number=\"209\"></td>\n" +
                "        <td id=\"LC209\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L210\" class=\"blob-num js-line-number\" data-line-number=\"210\"></td>\n" +
                "        <td id=\"LC210\" class=\"blob-code blob-code-inner js-file-line\">    “祖宗，你快走吧。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L211\" class=\"blob-num js-line-number\" data-line-number=\"211\"></td>\n" +
                "        <td id=\"LC211\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L212\" class=\"blob-num js-line-number\" data-line-number=\"212\"></td>\n" +
                "        <td id=\"LC212\" class=\"blob-code blob-code-inner js-file-line\">    那声音听上去都不像是他的了。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L213\" class=\"blob-num js-line-number\" data-line-number=\"213\"></td>\n" +
                "        <td id=\"LC213\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L214\" class=\"blob-num js-line-number\" data-line-number=\"214\"></td>\n" +
                "        <td id=\"LC214\" class=\"blob-code blob-code-inner js-file-line\">    我女人家珍当然知道我在城里这些花花绿绿的事，家珍是个好女人，我这辈子能娶上这么一个贤惠的女人，是我前世做狗吠叫了一辈子换来的。家珍对我从来都是逆来顺受，我在外面胡闹，她只是在心里打鼓，从不说我什么，和我娘一样。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L215\" class=\"blob-num js-line-number\" data-line-number=\"215\"></td>\n" +
                "        <td id=\"LC215\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L216\" class=\"blob-num js-line-number\" data-line-number=\"216\"></td>\n" +
                "        <td id=\"LC216\" class=\"blob-code blob-code-inner js-file-line\">    我在城里闹腾得实在有些过分，家珍心里当然有一团乱麻，乱糟糟的不能安分。有一天我从城里回到家中，刚刚坐下，家珍就笑盈盈地端出四样菜，摆在我面前，又给我斟满了酒，自己在我身旁坐下来待候我吃喝。她笑盈盈的样子让我觉得奇怪，不知道她遇上了什么好事，我左思右想也想不出这天是什么日子。我问她，她不说，就是笑盈盈地看着我。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L217\" class=\"blob-num js-line-number\" data-line-number=\"217\"></td>\n" +
                "        <td id=\"LC217\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L218\" class=\"blob-num js-line-number\" data-line-number=\"218\"></td>\n" +
                "        <td id=\"LC218\" class=\"blob-code blob-code-inner js-file-line\">    那四样菜都是蔬菜，家珍做得各不相同，可吃到下面都是一块差不多大小的猪肉。起先我没怎么在意，吃到最后一碗菜，底下又是一块猪肉。我一愣，随后我就嘿嘿笑了起来。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L219\" class=\"blob-num js-line-number\" data-line-number=\"219\"></td>\n" +
                "        <td id=\"LC219\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L220\" class=\"blob-num js-line-number\" data-line-number=\"220\"></td>\n" +
                "        <td id=\"LC220\" class=\"blob-code blob-code-inner js-file-line\">    我明白了家珍的意思，她是在开导我：女人看上去各不相同，到下面都是一样的。我对家珍说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L221\" class=\"blob-num js-line-number\" data-line-number=\"221\"></td>\n" +
                "        <td id=\"LC221\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L222\" class=\"blob-num js-line-number\" data-line-number=\"222\"></td>\n" +
                "        <td id=\"LC222\" class=\"blob-code blob-code-inner js-file-line\">    “这道理我也知道。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L223\" class=\"blob-num js-line-number\" data-line-number=\"223\"></td>\n" +
                "        <td id=\"LC223\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L224\" class=\"blob-num js-line-number\" data-line-number=\"224\"></td>\n" +
                "        <td id=\"LC224\" class=\"blob-code blob-code-inner js-file-line\">    道理我也知道，看到上面长得不一样的女人，我心里想的就是不一样，这实在是没办法的事。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L225\" class=\"blob-num js-line-number\" data-line-number=\"225\"></td>\n" +
                "        <td id=\"LC225\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L226\" class=\"blob-num js-line-number\" data-line-number=\"226\"></td>\n" +
                "        <td id=\"LC226\" class=\"blob-code blob-code-inner js-file-line\">    家珍就是这样一个女人，心里对我不满，脸上不让我看出来，弄些转弯抹角的点子来敲打我。我偏偏是软硬不吃，我爹的布鞋和家珍的菜都管不住我的腿，我就是爱往城里跑，爱往妓院钻。还是我娘知道我们男人心里想什么，她对家珍说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L227\" class=\"blob-num js-line-number\" data-line-number=\"227\"></td>\n" +
                "        <td id=\"LC227\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L228\" class=\"blob-num js-line-number\" data-line-number=\"228\"></td>\n" +
                "        <td id=\"LC228\" class=\"blob-code blob-code-inner js-file-line\">    “男人都是馋嘴的猫。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L229\" class=\"blob-num js-line-number\" data-line-number=\"229\"></td>\n" +
                "        <td id=\"LC229\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L230\" class=\"blob-num js-line-number\" data-line-number=\"230\"></td>\n" +
                "        <td id=\"LC230\" class=\"blob-code blob-code-inner js-file-line\">    我娘说这话不只是为我开脱，还揭了我爹的老底。我爹坐在椅子里，一听这话眼睛就眯成了两条门缝，嘿嘿笑了一下。我爹年轻时也不检点，他是老了干不动了才老实起来。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L231\" class=\"blob-num js-line-number\" data-line-number=\"231\"></td>\n" +
                "        <td id=\"LC231\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L232\" class=\"blob-num js-line-number\" data-line-number=\"232\"></td>\n" +
                "        <td id=\"LC232\" class=\"blob-code blob-code-inner js-file-line\">    我赌博时也在青楼，常玩的是麻将，牌九和骰子。我每赌必输，越输我越想把我爹年轻时输掉的一百多亩地赢回来。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L233\" class=\"blob-num js-line-number\" data-line-number=\"233\"></td>\n" +
                "        <td id=\"LC233\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L234\" class=\"blob-num js-line-number\" data-line-number=\"234\"></td>\n" +
                "        <td id=\"LC234\" class=\"blob-code blob-code-inner js-file-line\">    刚开始输了我当场给钱，没钱就去偷我娘和家珍的手饰，连我女儿凤霞的金项圈也偷了去。后来我干脆赊帐，债主们都知道我的家境，让我赊帐。自从赊帐以后，我就不知道自己输了有多少，债主也不提醒我，暗地里天天都在算计着我家那一百多亩地。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L235\" class=\"blob-num js-line-number\" data-line-number=\"235\"></td>\n" +
                "        <td id=\"LC235\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L236\" class=\"blob-num js-line-number\" data-line-number=\"236\"></td>\n" +
                "        <td id=\"LC236\" class=\"blob-code blob-code-inner js-file-line\">    一直到解放以后，我才知道赌博的赢家都是做了手脚的，难怪我老输不赢，他们是挖了个坑让我往里面跳。那时候青楼里有一位沈先生，年纪都快到六十岁了，眼睛还和猫眼似的贼亮，穿着蓝布长衫，腰板挺着笔直，平常时候总是坐在角落里，闭着眼睛像是在打盹。等到牌桌上的赌注越下越大，沈先生才咳嗽几声，慢悠悠地走过来，选一位置站着看，看了一会便有人站起来让位：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L237\" class=\"blob-num js-line-number\" data-line-number=\"237\"></td>\n" +
                "        <td id=\"LC237\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L238\" class=\"blob-num js-line-number\" data-line-number=\"238\"></td>\n" +
                "        <td id=\"LC238\" class=\"blob-code blob-code-inner js-file-line\">    “沈先生，这里坐。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L239\" class=\"blob-num js-line-number\" data-line-number=\"239\"></td>\n" +
                "        <td id=\"LC239\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L240\" class=\"blob-num js-line-number\" data-line-number=\"240\"></td>\n" +
                "        <td id=\"LC240\" class=\"blob-code blob-code-inner js-file-line\">    沈先生撩起长衫坐下，对另三位赌徒说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L241\" class=\"blob-num js-line-number\" data-line-number=\"241\"></td>\n" +
                "        <td id=\"LC241\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L242\" class=\"blob-num js-line-number\" data-line-number=\"242\"></td>\n" +
                "        <td id=\"LC242\" class=\"blob-code blob-code-inner js-file-line\">    “请。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L243\" class=\"blob-num js-line-number\" data-line-number=\"243\"></td>\n" +
                "        <td id=\"LC243\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L244\" class=\"blob-num js-line-number\" data-line-number=\"244\"></td>\n" +
                "        <td id=\"LC244\" class=\"blob-code blob-code-inner js-file-line\">    青楼里的人从没见到沈先生输过，他那双青筋突暴的手洗牌时，只听到哗哗的风声，那付牌在他手中忽长忽短，唰唰地进进出出，看得我眼睛都酸了。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L245\" class=\"blob-num js-line-number\" data-line-number=\"245\"></td>\n" +
                "        <td id=\"LC245\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L246\" class=\"blob-num js-line-number\" data-line-number=\"246\"></td>\n" +
                "        <td id=\"LC246\" class=\"blob-code blob-code-inner js-file-line\">    有一次沈先生喝醉了酒，对我说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L247\" class=\"blob-num js-line-number\" data-line-number=\"247\"></td>\n" +
                "        <td id=\"LC247\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L248\" class=\"blob-num js-line-number\" data-line-number=\"248\"></td>\n" +
                "        <td id=\"LC248\" class=\"blob-code blob-code-inner js-file-line\">    “赌博全靠一双眼睛一双手，眼睛要练成爪子一样，手要练成泥鳅那样滑。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L249\" class=\"blob-num js-line-number\" data-line-number=\"249\"></td>\n" +
                "        <td id=\"LC249\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L250\" class=\"blob-num js-line-number\" data-line-number=\"250\"></td>\n" +
                "        <td id=\"LC250\" class=\"blob-code blob-code-inner js-file-line\">    小日本投降那年，龙二来了，龙二说话时南腔北调，光听他的口音，就知道这人不简单，是闯荡过很多地方，见过大世面的人。龙二不穿长衫，一身白绸衣，和他同来的还有两个人，帮他提着两只很大的柳条箱。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L251\" class=\"blob-num js-line-number\" data-line-number=\"251\"></td>\n" +
                "        <td id=\"LC251\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L252\" class=\"blob-num js-line-number\" data-line-number=\"252\"></td>\n" +
                "        <td id=\"LC252\" class=\"blob-code blob-code-inner js-file-line\">    那年沈先生和龙二的赌局，实在是精彩，青楼的赌厅里挤满了人，沈先生和他们三个人赌。龙二身后站着一个跑堂的，托着一盘干毛巾，龙二不时取过一块毛巾擦手。他不拿湿毛巾拿干毛巾擦手，我们看了都觉得稀奇。他擦手时那副派头像是刚吃完了饭似的。起先龙二一直输，他看上去还满不在乎，倒是他带来的两个人沉不住气，一个骂骂咧咧，一个唉声叹气。沈先生一直赢，可脸上一点赢的意思都没有，沈先生皱着眉头，像是输了很多似的。他脑袋垂着，眼睛却跟钉子似的钉在龙二那双手上。沈先生年纪大了，半个晚上赌下来，就开始喘粗气，额头上汗水渗了出来，沈先生说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L253\" class=\"blob-num js-line-number\" data-line-number=\"253\"></td>\n" +
                "        <td id=\"LC253\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L254\" class=\"blob-num js-line-number\" data-line-number=\"254\"></td>\n" +
                "        <td id=\"LC254\" class=\"blob-code blob-code-inner js-file-line\">    “一局定胜负吧。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L255\" class=\"blob-num js-line-number\" data-line-number=\"255\"></td>\n" +
                "        <td id=\"LC255\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L256\" class=\"blob-num js-line-number\" data-line-number=\"256\"></td>\n" +
                "        <td id=\"LC256\" class=\"blob-code blob-code-inner js-file-line\">    龙二从盘子里取过最后一块毛巾，擦着手说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L257\" class=\"blob-num js-line-number\" data-line-number=\"257\"></td>\n" +
                "        <td id=\"LC257\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L258\" class=\"blob-num js-line-number\" data-line-number=\"258\"></td>\n" +
                "        <td id=\"LC258\" class=\"blob-code blob-code-inner js-file-line\">    “行啊。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L259\" class=\"blob-num js-line-number\" data-line-number=\"259\"></td>\n" +
                "        <td id=\"LC259\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L260\" class=\"blob-num js-line-number\" data-line-number=\"260\"></td>\n" +
                "        <td id=\"LC260\" class=\"blob-code blob-code-inner js-file-line\">    他们把所有的钱都压在了桌上，钱差不多把桌面占满了，只在中间留个空。每个人发了五张牌，亮出四张后，龙二的两个伙伴立刻泄气了，把牌一推说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L261\" class=\"blob-num js-line-number\" data-line-number=\"261\"></td>\n" +
                "        <td id=\"LC261\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L262\" class=\"blob-num js-line-number\" data-line-number=\"262\"></td>\n" +
                "        <td id=\"LC262\" class=\"blob-code blob-code-inner js-file-line\">    “完啦，又输了。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L263\" class=\"blob-num js-line-number\" data-line-number=\"263\"></td>\n" +
                "        <td id=\"LC263\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L264\" class=\"blob-num js-line-number\" data-line-number=\"264\"></td>\n" +
                "        <td id=\"LC264\" class=\"blob-code blob-code-inner js-file-line\">    龙二赶紧说：“没输，你们赢啦。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L265\" class=\"blob-num js-line-number\" data-line-number=\"265\"></td>\n" +
                "        <td id=\"LC265\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L266\" class=\"blob-num js-line-number\" data-line-number=\"266\"></td>\n" +
                "        <td id=\"LC266\" class=\"blob-code blob-code-inner js-file-line\">    说着龙二亮出最后那张牌，是黑桃Ａ，他的两个伙伴一看立刻嘿嘿笑了。其实沈先生最后那张牌也是黑桃Ａ，他是三Ａ带两Ｋ，龙二一个伙伴是三Ｑ带俩Ｊ。龙二抢先亮出了黑桃Ａ，沈先生怔了半晌，才把手中的牌一收说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L267\" class=\"blob-num js-line-number\" data-line-number=\"267\"></td>\n" +
                "        <td id=\"LC267\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L268\" class=\"blob-num js-line-number\" data-line-number=\"268\"></td>\n" +
                "        <td id=\"LC268\" class=\"blob-code blob-code-inner js-file-line\">    “我输了。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L269\" class=\"blob-num js-line-number\" data-line-number=\"269\"></td>\n" +
                "        <td id=\"LC269\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L270\" class=\"blob-num js-line-number\" data-line-number=\"270\"></td>\n" +
                "        <td id=\"LC270\" class=\"blob-code blob-code-inner js-file-line\">    龙二的黑桃Ａ和沈先生的都是从袖管里换出来的，一副牌不能有两张黑桃Ａ，龙二抢了先，沈先生心里明白也只能认输。那是我们第一次看到沈先生输，沈先生手推桌子站起来，向龙二他们作了个揖，转过身来往外走，走到门口微笑着说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L271\" class=\"blob-num js-line-number\" data-line-number=\"271\"></td>\n" +
                "        <td id=\"LC271\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L272\" class=\"blob-num js-line-number\" data-line-number=\"272\"></td>\n" +
                "        <td id=\"LC272\" class=\"blob-code blob-code-inner js-file-line\">    “我老了。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L273\" class=\"blob-num js-line-number\" data-line-number=\"273\"></td>\n" +
                "        <td id=\"LC273\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L274\" class=\"blob-num js-line-number\" data-line-number=\"274\"></td>\n" +
                "        <td id=\"LC274\" class=\"blob-code blob-code-inner js-file-line\">    后来再没人见过沈先生，听说那天天刚亮，他就坐着轿子走了。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L275\" class=\"blob-num js-line-number\" data-line-number=\"275\"></td>\n" +
                "        <td id=\"LC275\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L276\" class=\"blob-num js-line-number\" data-line-number=\"276\"></td>\n" +
                "        <td id=\"LC276\" class=\"blob-code blob-code-inner js-file-line\">    沈先生一走，龙二成了这里的赌博师傅。龙二和沈先生不一样，沈先生是只赢不输，龙二是赌注小常输，赌注大就没见他输过了。我在青楼常和龙二他们赌，有输*杏晕易*觉得自己没怎么输，其实我赢的都是小钱，输掉的倒是大钱，我还蒙在鼓里，以为自己马上就要光耀祖宗了。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L277\" class=\"blob-num js-line-number\" data-line-number=\"277\"></td>\n" +
                "        <td id=\"LC277\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L278\" class=\"blob-num js-line-number\" data-line-number=\"278\"></td>\n" +
                "        <td id=\"LC278\" class=\"blob-code blob-code-inner js-file-line\">    我最后一次赌博时，家珍来了，那时候天都快黑了，这是家珍后来告诉我的，我当初根本不知道天是亮着还是要黑了。家珍挺了个大肚子找到青楼来了，我儿子有庆在他娘肚子里长到七、八月个月了。家珍找到了我，一声不吭地跪在我面前，起先我没看到她，那天我手气特别好，掷出的骰子十有八九是我要的点数，坐在对面的龙二一看点数嘿嘿一笑说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L279\" class=\"blob-num js-line-number\" data-line-number=\"279\"></td>\n" +
                "        <td id=\"LC279\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L280\" class=\"blob-num js-line-number\" data-line-number=\"280\"></td>\n" +
                "        <td id=\"LC280\" class=\"blob-code blob-code-inner js-file-line\">    “兄弟我又栽了。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L281\" class=\"blob-num js-line-number\" data-line-number=\"281\"></td>\n" +
                "        <td id=\"LC281\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L282\" class=\"blob-num js-line-number\" data-line-number=\"282\"></td>\n" +
                "        <td id=\"LC282\" class=\"blob-code blob-code-inner js-file-line\">    龙二摸牌把沈先生赢了之后，青楼里没人敢和他摸牌了，我也不敢，我和龙二赌都是用骰子，就是骰子龙二玩的也很地道，他常赢少输，可那天他栽到我手里了，接连地输给我。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L283\" class=\"blob-num js-line-number\" data-line-number=\"283\"></td>\n" +
                "        <td id=\"LC283\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L284\" class=\"blob-num js-line-number\" data-line-number=\"284\"></td>\n" +
                "        <td id=\"LC284\" class=\"blob-code blob-code-inner js-file-line\">    他嘴里叼着烟卷，眼睛眯缝着像是什么事都没有，每次输了都还嘿嘿一笑，两条瘦胳膊把钱推过来时却是一百个不愿意。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L285\" class=\"blob-num js-line-number\" data-line-number=\"285\"></td>\n" +
                "        <td id=\"LC285\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L286\" class=\"blob-num js-line-number\" data-line-number=\"286\"></td>\n" +
                "        <td id=\"LC286\" class=\"blob-code blob-code-inner js-file-line\">    我想龙二你也该惨一次了。人都是一样的，手伸进别人口袋里掏钱时那个眉开眼笑，轮到自己给钱了一个个都跟哭丧一样。我正高兴着，有人扯了扯我的衣服，低头一看是自己的女人。看到家珍跪着我就火了，心想我儿子还没出来就跪着了，这太不吉利。我就对家珍说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L287\" class=\"blob-num js-line-number\" data-line-number=\"287\"></td>\n" +
                "        <td id=\"LC287\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L288\" class=\"blob-num js-line-number\" data-line-number=\"288\"></td>\n" +
                "        <td id=\"LC288\" class=\"blob-code blob-code-inner js-file-line\">    “起来，起来，你他娘的给我起来。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L289\" class=\"blob-num js-line-number\" data-line-number=\"289\"></td>\n" +
                "        <td id=\"LC289\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L290\" class=\"blob-num js-line-number\" data-line-number=\"290\"></td>\n" +
                "        <td id=\"LC290\" class=\"blob-code blob-code-inner js-file-line\">    家珍还真听话，立刻站了起来。我说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L291\" class=\"blob-num js-line-number\" data-line-number=\"291\"></td>\n" +
                "        <td id=\"LC291\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L292\" class=\"blob-num js-line-number\" data-line-number=\"292\"></td>\n" +
                "        <td id=\"LC292\" class=\"blob-code blob-code-inner js-file-line\">    “你来干什么，还不快给我回去。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L293\" class=\"blob-num js-line-number\" data-line-number=\"293\"></td>\n" +
                "        <td id=\"LC293\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L294\" class=\"blob-num js-line-number\" data-line-number=\"294\"></td>\n" +
                "        <td id=\"LC294\" class=\"blob-code blob-code-inner js-file-line\">    说完我就不管她了，看着龙二将骰子捧在手心里跟拜佛似的摇了几下，他一掷出脸色就难看了，说道：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L295\" class=\"blob-num js-line-number\" data-line-number=\"295\"></td>\n" +
                "        <td id=\"LC295\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L296\" class=\"blob-num js-line-number\" data-line-number=\"296\"></td>\n" +
                "        <td id=\"LC296\" class=\"blob-code blob-code-inner js-file-line\">    “摸过女人屁股就是手气不好。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L297\" class=\"blob-num js-line-number\" data-line-number=\"297\"></td>\n" +
                "        <td id=\"LC297\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L298\" class=\"blob-num js-line-number\" data-line-number=\"298\"></td>\n" +
                "        <td id=\"LC298\" class=\"blob-code blob-code-inner js-file-line\">    我一看自己又赢了，就说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L299\" class=\"blob-num js-line-number\" data-line-number=\"299\"></td>\n" +
                "        <td id=\"LC299\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L300\" class=\"blob-num js-line-number\" data-line-number=\"300\"></td>\n" +
                "        <td id=\"LC300\" class=\"blob-code blob-code-inner js-file-line\">    “龙二，你去洗洗手吧。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L301\" class=\"blob-num js-line-number\" data-line-number=\"301\"></td>\n" +
                "        <td id=\"LC301\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L302\" class=\"blob-num js-line-number\" data-line-number=\"302\"></td>\n" +
                "        <td id=\"LC302\" class=\"blob-code blob-code-inner js-file-line\">    龙二嘿嘿一笑，说道：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L303\" class=\"blob-num js-line-number\" data-line-number=\"303\"></td>\n" +
                "        <td id=\"LC303\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L304\" class=\"blob-num js-line-number\" data-line-number=\"304\"></td>\n" +
                "        <td id=\"LC304\" class=\"blob-code blob-code-inner js-file-line\">    “你把嘴巴子抹干净了再说话。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L305\" class=\"blob-num js-line-number\" data-line-number=\"305\"></td>\n" +
                "        <td id=\"LC305\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L306\" class=\"blob-num js-line-number\" data-line-number=\"306\"></td>\n" +
                "        <td id=\"LC306\" class=\"blob-code blob-code-inner js-file-line\">    家珍又扯了扯我的衣服，我一看，她又跪到地上。家珍细声细气地说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L307\" class=\"blob-num js-line-number\" data-line-number=\"307\"></td>\n" +
                "        <td id=\"LC307\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L308\" class=\"blob-num js-line-number\" data-line-number=\"308\"></td>\n" +
                "        <td id=\"LC308\" class=\"blob-code blob-code-inner js-file-line\">    “你跟我回去。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L309\" class=\"blob-num js-line-number\" data-line-number=\"309\"></td>\n" +
                "        <td id=\"LC309\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L310\" class=\"blob-num js-line-number\" data-line-number=\"310\"></td>\n" +
                "        <td id=\"LC310\" class=\"blob-code blob-code-inner js-file-line\">    要我跟一个女人回去？家珍这不是存心出我的丑？我的怒气一下子上来了，我看看龙二他们，他们都笑着看我，我对家珍吼道：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L311\" class=\"blob-num js-line-number\" data-line-number=\"311\"></td>\n" +
                "        <td id=\"LC311\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L312\" class=\"blob-num js-line-number\" data-line-number=\"312\"></td>\n" +
                "        <td id=\"LC312\" class=\"blob-code blob-code-inner js-file-line\">    “你给我滚回去。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L313\" class=\"blob-num js-line-number\" data-line-number=\"313\"></td>\n" +
                "        <td id=\"LC313\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L314\" class=\"blob-num js-line-number\" data-line-number=\"314\"></td>\n" +
                "        <td id=\"LC314\" class=\"blob-code blob-code-inner js-file-line\">    家珍还是说：“你跟我回去。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L315\" class=\"blob-num js-line-number\" data-line-number=\"315\"></td>\n" +
                "        <td id=\"LC315\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L316\" class=\"blob-num js-line-number\" data-line-number=\"316\"></td>\n" +
                "        <td id=\"LC316\" class=\"blob-code blob-code-inner js-file-line\">    我给了她两巴掌，家珍的脑袋像是拨郎鼓那样摇晃了几下。挨了我的打，她还是跪在那里，说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L317\" class=\"blob-num js-line-number\" data-line-number=\"317\"></td>\n" +
                "        <td id=\"LC317\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L318\" class=\"blob-num js-line-number\" data-line-number=\"318\"></td>\n" +
                "        <td id=\"LC318\" class=\"blob-code blob-code-inner js-file-line\">    “你不回去，我就不站起来。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L319\" class=\"blob-num js-line-number\" data-line-number=\"319\"></td>\n" +
                "        <td id=\"LC319\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L320\" class=\"blob-num js-line-number\" data-line-number=\"320\"></td>\n" +
                "        <td id=\"LC320\" class=\"blob-code blob-code-inner js-file-line\">    现在想起来叫我心疼啊，我年轻时真是个乌龟王八蛋。这么好的女人，我对她又打又踢。我怎么打她，她就是跪着不起来，打到最后连我自己都觉得没趣了，家珍头发披散眼泪汪汪地捂着脸。我就从赢来的钱里抓出一把，给了旁边站着的两个人，让他们把家珍拖出去，我对他们说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L321\" class=\"blob-num js-line-number\" data-line-number=\"321\"></td>\n" +
                "        <td id=\"LC321\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L322\" class=\"blob-num js-line-number\" data-line-number=\"322\"></td>\n" +
                "        <td id=\"LC322\" class=\"blob-code blob-code-inner js-file-line\">    “拖得越远越好。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L323\" class=\"blob-num js-line-number\" data-line-number=\"323\"></td>\n" +
                "        <td id=\"LC323\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L324\" class=\"blob-num js-line-number\" data-line-number=\"324\"></td>\n" +
                "        <td id=\"LC324\" class=\"blob-code blob-code-inner js-file-line\">    家珍被拖出去时，双手紧紧捂着凸起的肚子，那里面有我的儿子呵，家珍没喊没叫，被拖到了大街上，那两个人扔开她后，她就扶着墙壁站起来，那时候天完全黑了，她一个人慢慢往回走。后来我问她，她那时是不是恨死我了，她摇摇头说：</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L325\" class=\"blob-num js-line-number\" data-line-number=\"325\"></td>\n" +
                "        <td id=\"LC325\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L326\" class=\"blob-num js-line-number\" data-line-number=\"326\"></td>\n" +
                "        <td id=\"LC326\" class=\"blob-code blob-code-inner js-file-line\">    “没有。”</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L327\" class=\"blob-num js-line-number\" data-line-number=\"327\"></td>\n" +
                "        <td id=\"LC327\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L328\" class=\"blob-num js-line-number\" data-line-number=\"328\"></td>\n" +
                "        <td id=\"LC328\" class=\"blob-code blob-code-inner js-file-line\">    我的女人抹着眼泪走到她爹米行门口，站了很长时间，她看到她爹的脑袋被煤油灯的亮光印在墙上，她知道他是在清点帐目。她站在那里呜呜哭了一会，就走开了。</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L329\" class=\"blob-num js-line-number\" data-line-number=\"329\"></td>\n" +
                "        <td id=\"LC329\" class=\"blob-code blob-code-inner js-file-line\">\n" +
                "</td>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "        <td id=\"L330\" class=\"blob-num js-line-number\" data-line-number=\"330\"></td>\n" +
                "        <td id=\"LC330\" class=\"blob-code blob-code-inner js-file-line\">    家珍那天晚上走了十多里夜路回到了我家。她一个孤身女人，又怀着七个多月的有庆，一路上到处都是狗吠，下过一场大雨的路又坑坑洼洼。</td>\n" +
                "      </tr>\n" +
                "</table>\n" +
                "\n" +
                "  <details class=\"details-reset details-overlay BlobToolbar position-absolute js-file-line-actions dropdown d-none\" aria-hidden=\"true\">\n" +
                "    <summary class=\"btn-octicon ml-0 px-2 p-0 bg-white border border-gray-dark rounded-1\" aria-label=\"Inline file action toolbar\">\n" +
                "      <svg class=\"octicon octicon-kebab-horizontal\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path d=\"M8 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zM1.5 9a1.5 1.5 0 100-3 1.5 1.5 0 000 3zm13 0a1.5 1.5 0 100-3 1.5 1.5 0 000 3z\"></path></svg>\n" +
                "    </summary>\n" +
                "    <details-menu>\n" +
                "      <ul class=\"BlobToolbar-dropdown dropdown-menu dropdown-menu-se mt-2\" style=\"width:185px\">\n" +
                "        <li>\n" +
                "          <clipboard-copy role=\"menuitem\" class=\"dropdown-item\" id=\"js-copy-lines\" style=\"cursor:pointer;\">\n" +
                "            Copy lines\n" +
                "          </clipboard-copy>\n" +
                "        </li>\n" +
                "        <li>\n" +
                "          <clipboard-copy role=\"menuitem\" class=\"dropdown-item\" id=\"js-copy-permalink\" style=\"cursor:pointer;\">\n" +
                "            Copy permalink\n" +
                "          </clipboard-copy>\n" +
                "        </li>\n" +
                "        <li><a class=\"dropdown-item js-update-url-with-hash\" id=\"js-view-git-blame\" role=\"menuitem\" href=\"/qizong007/111800827/blame/10d73c4a2856225d50966aefd866e10c76736349/tests/orig_0.8_dis_10.txt\">View git blame</a></li>\n" +
                "          <li><a class=\"dropdown-item\" id=\"js-new-issue\" role=\"menuitem\" href=\"/qizong007/111800827/issues/new\">Reference in new issue</a></li>\n" +
                "      </ul>\n" +
                "    </details-menu>\n" +
                "  </details>\n" +
                "\n" +
                "  </div>\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "  \n" +
                "\n" +
                "\n" +
                "  <details class=\"details-reset details-overlay details-overlay-dark\" id=\"jumpto-line-details-dialog\">\n" +
                "    <summary data-hotkey=\"l\" aria-label=\"Jump to line\"></summary>\n" +
                "    <details-dialog class=\"Box Box--overlay d-flex flex-column anim-fade-in fast linejump\" aria-label=\"Jump to line\">\n" +
                "      <!-- '\"` --><!-- </textarea></xmp> --></option></form><form class=\"js-jump-to-line-form Box-body d-flex\" action=\"\" accept-charset=\"UTF-8\" method=\"get\">\n" +
                "        <input class=\"form-control flex-auto mr-3 linejump-input js-jump-to-line-field\" type=\"text\" placeholder=\"Jump to line&hellip;\" aria-label=\"Jump to line\" autofocus>\n" +
                "        <button type=\"submit\" class=\"btn\" data-close-dialog>Go</button>\n" +
                "</form>    </details-dialog>\n" +
                "  </details>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "    </main>\n" +
                "  </div>\n" +
                "\n" +
                "  </div>\n" +
                "\n" +
                "        \n" +
                "<div class=\"footer container-xl width-full p-responsive\" role=\"contentinfo\">\n" +
                "  <div class=\"position-relative d-flex flex-row-reverse flex-lg-row flex-wrap flex-lg-nowrap flex-justify-center flex-lg-justify-between pt-6 pb-2 mt-6 f6 text-gray border-top border-gray-light \">\n" +
                "    <ul class=\"list-style-none d-flex flex-wrap col-12 col-lg-5 flex-justify-center flex-lg-justify-between mb-2 mb-lg-0\">\n" +
                "      <li class=\"mr-3 mr-lg-0\">&copy; 2020 GitHub, Inc.</li>\n" +
                "        <li class=\"mr-3 mr-lg-0\"><a data-ga-click=\"Footer, go to terms, text:terms\" href=\"https://github.com/site/terms\">Terms</a></li>\n" +
                "        <li class=\"mr-3 mr-lg-0\"><a data-ga-click=\"Footer, go to privacy, text:privacy\" href=\"https://github.com/site/privacy\">Privacy</a></li>\n" +
                "        <li class=\"mr-3 mr-lg-0\"><a data-ga-click=\"Footer, go to security, text:security\" href=\"https://github.com/security\">Security</a></li>\n" +
                "        <li class=\"mr-3 mr-lg-0\"><a href=\"https://githubstatus.com/\" data-ga-click=\"Footer, go to status, text:status\">Status</a></li>\n" +
                "        <li><a data-ga-click=\"Footer, go to help, text:help\" href=\"https://docs.github.com\">Help</a></li>\n" +
                "\n" +
                "    </ul>\n" +
                "\n" +
                "    <a aria-label=\"Homepage\" title=\"GitHub\" class=\"footer-octicon d-none d-lg-block mx-lg-4\" href=\"https://github.com\">\n" +
                "      <svg height=\"24\" class=\"octicon octicon-mark-github\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"24\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0016 8c0-4.42-3.58-8-8-8z\"></path></svg>\n" +
                "</a>\n" +
                "   <ul class=\"list-style-none d-flex flex-wrap col-12 col-lg-5 flex-justify-center flex-lg-justify-between mb-2 mb-lg-0\">\n" +
                "        <li class=\"mr-3 mr-lg-0\"><a data-ga-click=\"Footer, go to contact, text:contact\" href=\"https://github.com/contact\">Contact GitHub</a></li>\n" +
                "        <li class=\"mr-3 mr-lg-0\"><a href=\"https://github.com/pricing\" data-ga-click=\"Footer, go to Pricing, text:Pricing\">Pricing</a></li>\n" +
                "      <li class=\"mr-3 mr-lg-0\"><a href=\"https://docs.github.com\" data-ga-click=\"Footer, go to api, text:api\">API</a></li>\n" +
                "      <li class=\"mr-3 mr-lg-0\"><a href=\"https://services.github.com\" data-ga-click=\"Footer, go to training, text:training\">Training</a></li>\n" +
                "        <li class=\"mr-3 mr-lg-0\"><a href=\"https://github.blog\" data-ga-click=\"Footer, go to blog, text:blog\">Blog</a></li>\n" +
                "        <li><a data-ga-click=\"Footer, go to about, text:about\" href=\"https://github.com/about\">About</a></li>\n" +
                "    </ul>\n" +
                "  </div>\n" +
                "  <div class=\"d-flex flex-justify-center pb-6\">\n" +
                "    <span class=\"f6 text-gray-light\"></span>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <div id=\"ajax-error-message\" class=\"ajax-error-message flash flash-error\">\n" +
                "    <svg class=\"octicon octicon-alert\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M8.22 1.754a.25.25 0 00-.44 0L1.698 13.132a.25.25 0 00.22.368h12.164a.25.25 0 00.22-.368L8.22 1.754zm-1.763-.707c.659-1.234 2.427-1.234 3.086 0l6.082 11.378A1.75 1.75 0 0114.082 15H1.918a1.75 1.75 0 01-1.543-2.575L6.457 1.047zM9 11a1 1 0 11-2 0 1 1 0 012 0zm-.25-5.25a.75.75 0 00-1.5 0v2.5a.75.75 0 001.5 0v-2.5z\"></path></svg>\n" +
                "    <button type=\"button\" class=\"flash-close js-ajax-error-dismiss\" aria-label=\"Dismiss error\">\n" +
                "      <svg class=\"octicon octicon-x\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z\"></path></svg>\n" +
                "    </button>\n" +
                "    You can’t perform that action at this time.\n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "    <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-bn/3rKJzBl2H64K38R8KaVcT26vKK7BJQC59lwYc+9fjlHzmy0fwh+hzBtsgTdhIi13dxjzNKWhdSN8WTM9qUw==\" type=\"application/javascript\" id=\"js-conditional-compat\" data-src=\"https://github.githubassets.com/assets/compat-bootstrap-6e7ff7ac.js\"></script>\n" +
                "    <script crossorigin=\"anonymous\" integrity=\"sha512-CxjaMepCmi+z0LTeztU2S8qGD25LyHD6j9t0RSPevy63trFWJVwUM6ipAVLgtpMBBgZ53wq8JPkSeQ6ruaZL2w==\" type=\"application/javascript\" src=\"https://github.githubassets.com/assets/environment-bootstrap-0b18da31.js\"></script>\n" +
                "    <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-OI5/7mbbF7NgEDkkOTHHMacH89Q1ZwFBUzRIp5CxZ0rbXIali/c2NVfQPjZEwrpLh4XmnaZ1B4vjcDimSb2/GA==\" type=\"application/javascript\" src=\"https://github.githubassets.com/assets/vendor-388e7fee.js\"></script>\n" +
                "    <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-6oTcBdHDfPUQ41MNh9xWCZ17Vk6K3k+yClX2uERAWSLsrRrOkV5SbLA9LnwoAakCGEfImqrUm3u7JgPWlyaEmg==\" type=\"application/javascript\" src=\"https://github.githubassets.com/assets/frameworks-ea84dc05.js\"></script>\n" +
                "    \n" +
                "    <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-HoNw9Sl7kKeJbbxwArYa5A20xsRg3fLbmsLHqAMh7k+QKqwFgZCj+3d/9Happwng6B3cGGFLFLJrxS7HJg/HGA==\" type=\"application/javascript\" src=\"https://github.githubassets.com/assets/behaviors-bootstrap-1e8370f5.js\"></script>\n" +
                "    \n" +
                "      <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-44qssMj+fXq3KdFy9Xwq1xbyF9+0lUDA4T8YID97FKD+j18CEaDsPGutuPP3frQFBwcikEViAK+3cFq5MzmQCg==\" type=\"application/javascript\" data-module-id=\"./contributions-spider-graph.js\" data-src=\"https://github.githubassets.com/assets/contributions-spider-graph-e38aacb0.js\"></script>\n" +
                "      <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-EOcKJC66ZRh9HbNcX4OaUtWMBVt6SEC3qOFS0QOam5vJQ1OD1sdHNk/Pns/CboOmqzrtBDObn7Cj06879tEsog==\" type=\"application/javascript\" data-module-id=\"./drag-drop.js\" data-src=\"https://github.githubassets.com/assets/drag-drop-10e70a24.js\"></script>\n" +
                "      <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-I7a2EZqGOJIvRNIIlxou5gPAzxyyRFTX8sjXiD9x3roIIbHGUJjrBes1TjNA/2OCnjh2OLikXPwfzZQcG3NYlA==\" type=\"application/javascript\" data-module-id=\"./jump-to.js\" data-src=\"https://github.githubassets.com/assets/jump-to-23b6b611.js\"></script>\n" +
                "      <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-rsUGFyiXcdKqK8d8KGr+uKVj3VFQCTg+7q0EmNiulTWVMxPxz/OG9U9raM1Gx7egMpgRVqxwRfYPURgv/f0UXA==\" type=\"application/javascript\" data-module-id=\"./profile-pins-element.js\" data-src=\"https://github.githubassets.com/assets/profile-pins-element-aec50617.js\"></script>\n" +
                "      <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-qECv/jhsvLFN77eGNu0cjMR2+zvAlLyhQVTnmayJc5OLZoxMLjQZxZW1hK/dhcYro6Wec/aiF21HYf2N5OilYQ==\" type=\"application/javascript\" data-module-id=\"./randomColor.js\" data-src=\"https://github.githubassets.com/assets/randomColor-a840affe.js\"></script>\n" +
                "      <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-vK7rRnsAi4qcmC2HqCfPyEBZgIMWb6Azyb1PJxgL1FtEFMydK//dsnuLdVx+RaPGg71Z58ossFXqkLWgMevvdw==\" type=\"application/javascript\" data-module-id=\"./sortable-behavior.js\" data-src=\"https://github.githubassets.com/assets/sortable-behavior-bcaeeb46.js\"></script>\n" +
                "      <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-mHqsE5aQq7fAmmLd0epHBJK8rn8DOVnjW2YQOT8wvsN1oLrypw0cDFmwXPDwbMghHyo4kKiOtVJ/kEsEzwwibw==\" type=\"application/javascript\" data-module-id=\"./tweetsodium.js\" data-src=\"https://github.githubassets.com/assets/tweetsodium-987aac13.js\"></script>\n" +
                "      <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-OBi4mmeYw2a1J5Tco9b+p6XRPtxOhulh8Ya7q5/9OAR2J9WArD1VzQlYPCkvq4thL0SjoFNGhwjjvblLANwKzA==\" type=\"application/javascript\" data-module-id=\"./user-status-submit.js\" data-src=\"https://github.githubassets.com/assets/user-status-submit-3818b89a.js\"></script>\n" +
                "    \n" +
                "    <script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-dVmYmajDmMmC/HnUfse7kgbolgEMILS6NM8Zx2RQ7kkVtiJwMA3RNl6QFfCBsqwtUKLxDe0jGxcqJgmlVa3FZQ==\" type=\"application/javascript\" src=\"https://github.githubassets.com/assets/repositories-bootstrap-75599899.js\"></script>\n" +
                "<script crossorigin=\"anonymous\" async=\"async\" integrity=\"sha512-F3YQLSC+H6Tu+2gKp28u28yB2tsLECKfVigfF+fM95eiXTvGhB2ZUTERMm8ZDI8hEOvCkleYBgMFkxBetkl6zw==\" type=\"application/javascript\" src=\"https://github.githubassets.com/assets/github-bootstrap-1776102d.js\"></script>\n" +
                "  <div class=\"js-stale-session-flash flash flash-warn flash-banner\" hidden\n" +
                "    >\n" +
                "    <svg class=\"octicon octicon-alert\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M8.22 1.754a.25.25 0 00-.44 0L1.698 13.132a.25.25 0 00.22.368h12.164a.25.25 0 00.22-.368L8.22 1.754zm-1.763-.707c.659-1.234 2.427-1.234 3.086 0l6.082 11.378A1.75 1.75 0 0114.082 15H1.918a1.75 1.75 0 01-1.543-2.575L6.457 1.047zM9 11a1 1 0 11-2 0 1 1 0 012 0zm-.25-5.25a.75.75 0 00-1.5 0v2.5a.75.75 0 001.5 0v-2.5z\"></path></svg>\n" +
                "    <span class=\"js-stale-session-flash-signed-in\" hidden>You signed in with another tab or window. <a href=\"\">Reload</a> to refresh your session.</span>\n" +
                "    <span class=\"js-stale-session-flash-signed-out\" hidden>You signed out in another tab or window. <a href=\"\">Reload</a> to refresh your session.</span>\n" +
                "  </div>\n" +
                "  <template id=\"site-details-dialog\">\n" +
                "  <details class=\"details-reset details-overlay details-overlay-dark lh-default text-gray-dark hx_rsm\" open>\n" +
                "    <summary role=\"button\" aria-label=\"Close dialog\"></summary>\n" +
                "    <details-dialog class=\"Box Box--overlay d-flex flex-column anim-fade-in fast hx_rsm-dialog hx_rsm-modal\">\n" +
                "      <button class=\"Box-btn-octicon m-0 btn-octicon position-absolute right-0 top-0\" type=\"button\" aria-label=\"Close dialog\" data-close-dialog>\n" +
                "        <svg class=\"octicon octicon-x\" viewBox=\"0 0 16 16\" version=\"1.1\" width=\"16\" height=\"16\" aria-hidden=\"true\"><path fill-rule=\"evenodd\" d=\"M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z\"></path></svg>\n" +
                "      </button>\n" +
                "      <div class=\"octocat-spinner my-6 js-details-dialog-spinner\"></div>\n" +
                "    </details-dialog>\n" +
                "  </details>\n" +
                "</template>\n" +
                "\n" +
                "  <div class=\"Popover js-hovercard-content position-absolute\" style=\"display: none; outline: none;\" tabindex=\"0\">\n" +
                "  <div class=\"Popover-message Popover-message--bottom-left Popover-message--large Box box-shadow-large\" style=\"width:360px;\">\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "  </body>\n" +
                "</html>\n" +
                "\n";
        SimhashTest simhashTest = new SimhashTest();
        String doc = simhashTest.cleanWords(html);

        System.out.println(doc);

    }
}