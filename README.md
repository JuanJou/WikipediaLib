# AyDS-2018-A1-Projecto-Alpha

Juan Jouglard

Ignacio Suburu

Luciano Fuentes


## Repositorio de la librería
Para añadir al proyecto, ejecutar el comando
```git submodule add https://github.com/JuanJou/WikipediaLib.git```

## Utilización de librería de Wikipedia
Para la utilización de la libería se debe usar el modulo DataWikipediaModule, implementado con el patron Singleton, de la siguiente manera:
```java
DataWikipedia dataWikipedia = DataWikipediaModule.getInstance().getDataWikipedia();
```

Para la consulta de un termino se debe utilizar el metodo 
```java
String getMeaning(String term) throws IOException
String definicion=dataWikipedia.getMeaning("Termino");
```
Se debe pasar el ```String``` del termino a buscar. El metodo devuelve un ```String``` que contiene el resultado de la busqueda, en caso de no encontrar el termino el metodo devuelve ```null```
