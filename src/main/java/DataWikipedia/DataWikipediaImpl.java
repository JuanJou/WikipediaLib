package DataWikipedia;

import java.io.IOException;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

class DataWikipediaImpl implements DataWikipedia {

    protected WikipediaAPI wiki;
    private Parser parserResponse;

    DataWikipediaImpl(Parser parser){

        parserResponse = parser;
        this.connect();
    }

    @Override
    public String getMeaning(String term) throws IOException{
        
        Response<String> response;

        response = wiki.getTerm(term).execute();

        String definitionWiki = parserResponse.parserDefinition(response.body());

        return definitionWiki;
    }

    @Override
    public void connect() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://en.wikipedia.org/w/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        wiki = retrofit.create(WikipediaAPI.class);
    }
}