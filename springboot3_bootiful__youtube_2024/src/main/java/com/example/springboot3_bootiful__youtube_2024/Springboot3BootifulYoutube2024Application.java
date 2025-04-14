package com.example.springboot3_bootiful__youtube_2024;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListSet;

@SpringBootApplication
public class Springboot3BootifulYoutube2024Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3BootifulYoutube2024Application.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                var threads = new ArrayList<Thread>();
                var names = new ConcurrentSkipListSet<String>();

                for (var i = 0; i < 1_000; i++) {
                    var first = i == 0;

                    // thread name won't change
                    threads.add(Thread.ofPlatform().unstarted(new Runnable() {
                        @Override
                        public void run() {
                            if (first) {
                                names.add(Thread.currentThread().toString());
                            }
                            try {
                                Thread.sleep(100);
                            }catch (InterruptedException e) {
                                //
                            }

                            if (first) {
                                names.add(Thread.currentThread().toString());
                            }
                            try {
                                Thread.sleep(100);
                            }catch (InterruptedException e) {
                                //
                            }
                        }
                    }));

                    // you will see new thread name after sleep
                    threads.add(Thread.ofVirtual().unstarted(new Runnable() {
                        @Override
                        public void run() {
                            if (first) {
                                names.add(Thread.currentThread().toString());
                            }
                            try {
                                Thread.sleep(100);
                            }catch (InterruptedException e) {
                                //
                            }

                            if (first) {
                                names.add(Thread.currentThread().toString());
                            }
                            try {
                                Thread.sleep(100);
                            }catch (InterruptedException e) {
                                //
                            }
                        }
                    }));
                }

                for (var t : threads)
                    t.start();
                for (var t : threads)
                    t.join();
                System.out.println(names);
            }
        };
    }

}
