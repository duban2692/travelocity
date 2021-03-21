package com.co.travelocity.web.userinterface;

public enum UrlInicioWeb {

    UrlInicio("https://www.travelocity.com");

    private final String url;


    UrlInicioWeb(String url) {
        this.url = url;
    }

    public String Url() {

        return url;
    }
}
