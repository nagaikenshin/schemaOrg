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
System.out.println(SimpleJsonBuilder.toJsonLd(creativeWork, CreativeWork.class));
```
Results:
```
{"author":{"person":{"name":{"text":"誰か"}}}}
{"@context":"http:\/\/schema.org","@type":"CreativeWork","author":{"@context":"http:\/\/schema.org","@type":"Person","name":"誰か"}}
```

[Sample source](/schemaOrgSample/src/test/java/org/kyojo/schemaorg/sample/SimpleJsonBuilderTest.java)

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
    "@type": "NewsArticle",
    "mainEntityOfPage": {
        "@type": "WebPage",
        "@id": "https://google.com/article"
    },
    "headline": "Article headline",
    "image": [
        "https://example.com/photos/1x1/photo.jpg",
        "https://example.com/photos/4x3/photo.jpg",
        "https://example.com/photos/16x9/photo.jpg"
    ],
    "datePublished": "2015-02-05",
    "dateModified": "2015-02-05T09:20:00+08:00",
    "author": {
        "@type": "Person",
        "name": "John Doe"
    },
    "publisher": {
        "@type": "Organization",
        "name": "Google",
        "logo": {
            "@type": "ImageObject",
            "url": "https://google.com/logo.jpg"
        }
    },
    "description": "A most wonderful article"
}
```
```
Map<String, JsonLdThingStringGiven> thingStrModeMap = new HashMap<>();
thingStrModeMap.put("url", JsonLdThingStringGiven.AS_URL);
thingStrModeMap.put("image", JsonLdThingStringGiven.AS_URL);
thingStrModeMap.put("item", JsonLdThingStringGiven.AS_THING_IDENTIFIER_URL);
Map<String, String> jsonLdRootMap = new HashMap<>();
String json1 = SimpleJsonWalker.jsonLdToJson(jsonLd, jsonLdRootMap,
        thingStrModeMap, JsonLdAtIdStringGiven.AS_AUTO);
String json2 = SimpleJsonWalker.formatJson(json1, "\t");
System.out.println(json2);
```
Results:
```
{
    "datePublished" : "2015-02-05",
    "image" : {
        "url" : [
            "https://example.com/photos/1x1/photo.jpg",
            "https://example.com/photos/4x3/photo.jpg",
            "https://example.com/photos/16x9/photo.jpg"
        ]
    },
    "author" : {
        "person" : {
            "name" : "John Doe"
        }
    },
    "publisher" : {
        "organization" : {
            "name" : "Google",
            "logo" : {
                "imageObject" : {
                    "url" : {
                        "url" : "https://google.com/logo.jpg"
                    }
                }
            }
        }
    },
    "description" : "A most wonderful article",
    "dateModified" : "2015-02-05T09:20:00+08:00",
    "mainEntityOfPage" : {
        "webPage" : {
            "identifier" : {
                "url" : "https:\/\/google.com\/article"
            }
        }
    },
    "headline" : "Article headline"
}
```

[Sample source](/schemaOrgSample/src/test/java/org/kyojo/schemaorg/sample/SimpleJsonWalkerTest.java)

Web framework integration
-------------------------

[kyojoLib](https://github.com/nagaikenshin/kyojoLib) is the web framework natively supports the data structure of schema.org.

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

There are two level of detail implementations `full` and `digest`. The full implementation is not suitable for realtime processing. The digest implementation is also provided, extracted important classes for general purpose.

* [kyojo-schemaorg-m3n4-full-cmn](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-full-cmn)
* [kyojo-schemaorg-m3n4-full-impl](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-full-impl)
* [kyojo-schemaorg-m3n4-full-gson](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-full-gson)
* [kyojo-schemaorg-m3n4-full-doma](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-full-doma)
* [kyojo-schemaorg-m3n4-full-domaConv](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-full-domaConv)

* [kyojo-schemaorg-m3n4-digest-cmn](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-digest-cmn)
* [kyojo-schemaorg-m3n4-digest-impl](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-digest-impl)
* [kyojo-schemaorg-m3n4-digest-gson](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-digest-gson)
* [kyojo-schemaorg-m3n4-digest-doma](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-digest-doma)
* [kyojo-schemaorg-m3n4-digest-domaConv](https://mvnrepository.com/artifact/org.kyojo/kyojo-schemaorg-m3n4-digest-domaConv)

