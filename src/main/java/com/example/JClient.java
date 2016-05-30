package com.example;

import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.pattern.Patterns;
import com.example.datastore.messages.SetRequest;
import scala.compat.java8.FutureConverters;

import java.util.concurrent.CompletionStage;

class JClient {
    private final ActorSystem system = ActorSystem.create("LocalSystem");

    private final ActorSelection remoteDb;

    public JClient(String remoteAddress) {
        remoteDb = system.actorSelection("akka.tcp://akkademy@" + remoteAddress + "/user/akkademy-db-java");
    }

    public CompletionStage set(String key, Object value) {
        return FutureConverters.toJava(Patterns.ask(remoteDb, new SetRequest(key,value), 2000));
    }

}
