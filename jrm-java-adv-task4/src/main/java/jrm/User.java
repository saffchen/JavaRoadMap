package jrm;

public class User {

    @JsonElement
    private String name;
    @JsonElement(key = "personAge")
    private String age;

    private String country;
}
