package com.crakama.admin.regstudent;

/**
 * Created by Administrator on 8/18/2016.
 */
public class Course {
    private String name;
    private String description;

    public static final Course[] courses = {

            new Course("ANDROID PROGRAMMING","Android is a mobile operating system developed by Google.\n" +
                    " It is used by several smartphones and tablets.\n" +
                    " Examples include the Sony Xperia, the Samsung Galaxy, and the Google Nexus One"),
            new Course("PYTHON","Python is a computer programming language that lets you work more quickly than other programming languages.\n" +
                    " Experienced programmers in any other language can pick up Python very quickly, \n" +
                    " and beginners find the clean syntax and indentation structure easy to learn.\n " +
                    "This tutorial will help you to become a python developer"),
            new Course("JAVA", "Java is a high-level programming language originally developed by Sun Microsystems and released in 1995.\n" +
                    " Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX.\n " +
                    "This tutorial gives a complete understanding of Java."),
            new Course("HTML", "In this course, you will use computers to creatively design web pages using HTML and CSS. \n" +
                    " You will then use Javascript to develop programs and algorithms--ways to get the computer to solve problems.\n  " +
                    "As you progress, you will master the programming process that will be used through the remainder of the courses in this Specialization.\n"),
            new Course("RUBY ON RAILS","Ruby on Rails, or simply Rails, is a web application framework written in Ruby under the MIT License.\n " +
                    "Rails is a model–view–controller (MVC) framework, providing default structures for a database, a web service, and web pages. \n" +
                    "It encourages and facilitates the use of web standards such as JSON or XML for data transfer, and HTML,\n " +
                    "CSS and JavaScript for display and user interfacing")
    };

    //Each course has a name and description
    public Course(String name, String description) {

        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }
   //The string representation of a Course is its name
    public  String toString(){
        return  this.name;
    }
}
