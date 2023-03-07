# pokeapi-dex
Simple Pokemon Image

This is the start of a simple API that will act similar to a Pokédex. It will only cover generation one, or otherwise known as the original 151 Pokémon. As of publishing, you can request the name of the Pokémon by providing its dex number. In future, once you provide the dex number, you will be able to receive more information such as type, height, location, etc.

Pokémon and its respective IP is property of The Pokemon Company. This is a fan-made API. Programs used include Spring Boot, Docker, IntelliJ IDEA CE. All of which are owned/operated by their respective entities.

Setup: First open your CLI and use: <docker run -d -p 80:8080 --name simple-pokemon-image> Where name is the container and 80 is the port for your host and 8080 is the port for the container itself

Now you can open the internet browser of your choosing. Next, in the address bar, enter “localhost:80/pokemon”. This will return a list of Pokemon. Additionally, you can enter “localhost:80/pokemon/#” where # is the number of the pokemon you are looking for, ex. Localhost:80/pokemon/4 will give Charmander. As previously mentioned, more Pokemon and corresponding data will be added in the future.
