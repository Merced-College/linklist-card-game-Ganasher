[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19523281)
    // Gabriel Bostic
    //5-13-2025
    //War
    //Players each get a starting hand of 5 cards and the game runs until each player is out of cards
    //from their hand. Ends after 5 rounds, each auto-played (no enter command between rounds), and 
    //each player sees their final score.
    //The linked list is used to hold the cards each player is dealt at the start and then compared.
    //The game is so simple the auto-cycle through each round felt sufficient.
    //If I was going to modify it even further I would reintroduce "won" cards to the tail of
    //the winning players linked list and consider the win condition to be the elimination of the 
    //"deck" for one player (i.e. both that players head and tail are the same node, both reading null).