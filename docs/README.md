# Scalable Delivery Message Engine
## Overview
Currently we have different business use case that implement room based communication, room based communication 
also have different operation such as broadcasting message to all the room members, manage member, this module is 
designed for different use cases that use room based communication for example, chat application, signalling
application, and much more
## Designing Strategy
This application will responsible only simple room based deliver system, we have secured channel for authorized
client to be connected and send any kind of messages to the system without content verification, this means client
application must be able to handle different message types, there fore the controller must implement the control 
logic to support different types of messages

## Logical Todo List
* Identify which incoming connection belong to which members of the room
  * Use user registry
    * Temporary User Registry
    * Permanent User Registry
  * Implement by when connect to websocket, the actor try to resolve the room actors that related to the specific user
    then connect to the room actor (Hopefully the room actor can be access via network)
## Researching List
* Connect Websocket
* Binding Connection and Room