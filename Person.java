package com.example.e_resumemobileapplication;

public class Person {

    Contact detail;
    String[] educations;
    String[] skills;
    String[] awards;
    String[] hobbies;
    String[] languages;
    String[] experiences;
    String imagePath;

    public Person()
    {}

    public Person(String name,String phone,String email,int age,String[] educations,String[] skills,String[] awards,String[] hobbies,String[] languages,String[] experiences,String imagePath)
    {
        this.detail = new Contact(name,email,phone,age);
        for(int i=0; i< 4; i++)
        {
            this.educations[i] = educations[i];
            this.skills[i] = skills[i];
            this.awards[i] = awards[i];
            this.hobbies[i] = hobbies[i];
            this.languages[i] = languages[i];
            this.experiences[i] = experiences[i];
        }
        this.imagePath = imagePath;
    }
}
