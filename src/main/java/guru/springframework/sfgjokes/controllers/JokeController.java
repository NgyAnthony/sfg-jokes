package guru.springframework.sfgjokes.controllers;

import guru.springframework.sfgjokes.services.FetchJokeImpl;
import guru.springframework.sfgjokes.services.FetchJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final FetchJokeImpl fetchJokeImpl;

    @Autowired // Optional
    public JokeController(FetchJokeImpl fetchJokeImpl) {
        this.fetchJokeImpl = fetchJokeImpl;
    }

    @RequestMapping({"", "/"})
    public String getJokes(Model model) {
        model.addAttribute("joke", fetchJokeImpl.getJoke());
        return "jokes";
    }
}
