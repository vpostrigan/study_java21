package com.example.springboot3_bootiful__youtube_2024;

//import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@ResponseBody
public class StoryControllerAI {
/*
    private final ChatClient singularity;

    public StoryControllerAI(ChatClient.Builder builder) {
        this.singularity = builder.build();
    }

    // localhost:8080/story
    @GetMapping
    Map<String, String> story() {
        var prompt = """
                Dear Singularity, ...
                
                Please
                """;
        var reply = this.singularity.prompt(prompt);
        return Map.of("story", "");
    }
*/
}
