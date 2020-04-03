package guru.springframework.sfgjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class FetchJokeImpl implements FetchJokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public FetchJokeImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
