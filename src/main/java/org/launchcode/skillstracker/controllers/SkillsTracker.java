package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsTracker {

    @GetMapping
    @ResponseBody
    public String index() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like you to learn.  Here is the list!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>Rust</li>" +
                        "<li>Scala</li>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                "<form method='POST' action='form'>" +
                    "Name: <input type='text' name='name'>" +
                    "<br />My favorite language:<br /><select name='language'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Rust'>Rust</option>" +
                        "<option value='Scala'>Scala</option>" +
                    "</select>" +
                    "<br />My 2nd favorite language:<br /><select name='language2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Rust'>Rust</option>" +
                        "<option value='Scala'>Scala</option>" +
                    "</select>" +
                    "<br />My 3rd favorite language:<br /><select name='language3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Rust'>Rust</option>" +
                        "<option value='Scala'>Scala</option>" +
                    "</select>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String formResponse(@RequestParam String name, @RequestParam String language, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<table><tr>" +
                            "<td>" + language + "</td></tr>" +
                            "<tr><td>" + language2 + "</td></tr>" +
                            "<tr><td>" + language3 + "</td>" +
                        "</tr></table>" +
                    "</body>" +
                "</html>";

    }


}
