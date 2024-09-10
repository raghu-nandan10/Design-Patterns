package patterns.creational.Builder.Representations;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String url;
    private Map<String,String> headers;

    private Map<String,String> queryParams;

    private String body;

    private int timeOut;

    private String method;

    private HttpRequest(Builder builder){
        this.method = builder.method;
        this.url = builder.url;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.body = builder.body;
        this.timeOut = builder.timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest [method=" + method + ", url=" + url + ", headers=" + headers +
                ", queryParams=" + queryParams + ", body=" + body + ", timeout=" + timeOut + "]";
    }


    public static class Builder{
        private String method;
        private String url;
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParams = new HashMap<>();
        private String body;
        private int timeout = 5000; // Default timeout 5

        public  Builder(String method,String url){
            this.method=method;
            this.url=url;
        }

        public Builder addHeader(String key, String value) {
            headers.put(key, value);
            return this;
        }

        public Builder addQueryParam(String key, String value) {
            queryParams.put(key, value);
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        // Build method to return the final HttpRequest object
        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }



}

