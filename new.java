 webView.setWebViewClient(new MyWebViewClient());
private static class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.startsWith("https://play.google.com/store/apps/")) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                view.getContext().startActivity(intent);
                return true;
            }
            return false;
        }
    }
