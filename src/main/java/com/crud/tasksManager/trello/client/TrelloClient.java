package com.crud.tasksManager.trello.client;

import com.crud.tasksManager.domain.TrelloBoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class TrelloClient {

    @Value("${trello.api.endpoint.prod}")
    private String trelloApiEndpoint;

    @Value("${trello.app.key}")
    private String trelloAppKey;

    @Value("${trello.app.token}")
    private String trelloToken;


    @Autowired
    private RestTemplate restTemplate;

//    public List<TrelloBoardDto> getTrelloBoards() {
//
//        TrelloBoardDto[] boardsResponse = restTemplate.getForObject(
//                "https://api.trello.com/1/members/a6B4DI3v/boards" + "?key=" + trelloAppKey + "&token=" + trelloToken,
//        TrelloBoardDto[].class);
//
//        return null;
//    }

    public List<TrelloBoardDto> getTrelloBoards() {

        URI url = UriComponentsBuilder.fromHttpUrl(trelloApiEndpoint + "/members/aleja/boards")
                .queryParam("key", trelloAppKey)
                .queryParam("token", trelloToken)
                .queryParam("fields", "name,id")
                .queryParam("lists", "all").build().encode().toUri();


        TrelloBoardDto[] boardsResponse = restTemplate.getForObject(url, TrelloBoardDto[].class);


        if (boardsResponse != null) {
            return Arrays.asList(boardsResponse);
        }
        return new ArrayList<>();
    }
}
