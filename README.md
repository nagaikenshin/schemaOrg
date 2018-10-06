schemaOrg
=========

Overview
--------

A Java implementation of [schema.org](http://schema.org/) data structure.

Class and Property types mapping
--------------------------------

(schema.org's) class types mapped like
```
http://schema.org/Person
org.kyojo.schemaorg.m3n4.core.Clazz$Person
```

Property types mapped like
```
http://schema.org/author
org.kyojo.schemaorg.m3n4.core.Container$Author
```

These are interfaces and have each entity classes like
```
org.kyojo.schemaorg.m3n4.core.impl.PERSON
org.kyojo.schemaorg.m3n4.core.impl.AUTHOR
```

Class and Property types field possession
-----------------------------------------

(schema.org's) class types has fields of (schema.org's) property types in the singular object.
```
org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
    public Container.Author getAuthor();
    public void setAuthor(Container.Author author);
```
Property types has fields of class types in the List object.
```
org.kyojo.schemaorg.m3n4.core.Container$Author
    public Clazz.Person getPerson();
    public void setPerson(Clazz.Person person);
    public List<Clazz.Person> getPersonList();
    public void setPersonList(List<Clazz.Person> personList);
    public boolean hasPerson();
```
Just like above, property types are accessed with getter/setter methods, and class types with 5 kinds of methods.

Main constructors
-----------------

General class type's entity classes has at least 2 constructors, no arguments and one String. If one String given, it is interpreted as a name property given.
```
    public PERSON() {
    }

    public PERSON(String string) {
        setName(new NAME(new TEXT(string)));
    }
```

Dedicated JSON builder
----------------------

`org.kyojo.schemaorg.SimpleJsonBuilder` is the JSON builder for JSONizing schemeOrg objects. It is added some functions internally no other general JSON builders provide, but enough available as a simple JSON builder for any purpose.
```
CreativeWork creativeWork = new CREATIVE_WORK();
Author author = new AUTHOR(new PERSON("誰か"));
creativeWork.setAuthor(author);
System.out.println(SimpleJsonBuilder.toJson(creativeWork));
System.out.println(SimpleJsonBuilder.toJsonLd(creativeWork));
```
Results:
```
{"author":{"person":{"name":{"text":"誰か"}}}}
{"author":{"@context":"http:\/\/schema.org","@type":"Person","name":"誰か"}}
```

GSON assumed for deserialization
--------------------------------

The deserialization JSONized schemaOrg objects is [GSON](https://github.com/google/gson) use assumed.
The correspondence list of interfaces and deserializers is written in `org.kyojo.schemaorg.m3n4.gson.GsonTypeAdapters.properties`. Load and register by GsonBuilder calling registerTypeAdapter() method.

JSON structure analyzing utility class
--------------------------------------

`org.kyojo.schemaorg.SimpleJsonWalker` is the utility class for analyzing JSON structure. It realize the formatting JSON and the conversion JSON-LD to JSON. If this JSON-LD is the data structure of schema.org, the converted JSON is deserializable to a schemaOrg object.

JSON-LD:
```
{
    "@context": "http://schema.org",
    "@type": "ItemList",
    "url": "http://multivarki.ru?filters%5Bprice%5D%5BLTE%5D=39600",
    "numberOfItems": "315",
    "itemListElement": [
        {
            "@type": "Product",
            "image": "http://img01.multivarki.ru.ru/c9/f1/a5fe6642-18d0-47ad-b038-6fca20f1c923.jpeg",
            "url": "http://multivarki.ru/brand_502/",
            "name": "Brand 502"
        },
        {
            "@type": "Product",
            "name": "..."
        }
    ],
    "offers": {
        "@type": "Offer",
        "price": "4399 p."
    }
}
```
```
Map<String, String> jsonLdRootMap = new HashMap<>();
String json1 = SimpleJsonWalker.jsonLdToJson(jsonLd, jsonLdRootMap, null, null);
String json2 = SimpleJsonWalker.formatJson(json1, "\t");
```
Results:
```
{
    "offers" : {
        "offer" : {
            "price" : "4399 p."
        }
    },
    "itemListElement" : {
        "productList" : [
            {
                "image" : "http://img01.multivarki.ru.ru/c9/f1/a5fe6642-18d0-47ad-b038-6fca20f1c923.jpeg",
                "name" : "Brand 502",
                "url" : "http://multivarki.ru/brand_502/"
            },
            {
                "name" : "..."
            }
        ]
    },
    "numberOfItems" : "315",
    "url" : "http://multivarki.ru?filters%5Bprice%5D%5BLTE%5D=39600"
}
```

Examples
--------

Short examples found [here](https://kyojo.org/kyojoLab/schemaOrgLab/index.html).

Included Projects
-----------------

* schemaOrgWork - The generator of the following 4 projects classes source codes.
* schemaOrgImpl - The implementation classes. (ordinary use)
* schemaOrgGson - GSON deserializers for schemaOrgImpl.
* schemaOrgDoma - schemaOrgImpl added [Doma](http://doma.readthedocs.io/ja/stable/) domain class use features.
* schemaOrgDomaConv - Converters for schemaOrgDoma.

Maven Repository
----------------

* [kyojo-schemaorg-m3n4-cmn](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-cmn)
* [kyojo-schemaorg-m3n4-impl](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-impl)
* [kyojo-schemaorg-m3n4-gson](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-gson)
* [kyojo-schemaorg-m3n4-doma](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-doma)
* [kyojo-schemaorg-m3n4-domaConv](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-domaConv)

