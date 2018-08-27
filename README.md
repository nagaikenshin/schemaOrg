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

Included Projects
-----------------

* schemaOrgWork - The generator of the following 4 projects classes source codes.
* schemaOrgImpl - The implementation classes. (ordinary use)
* schemaOrgGson - GSON deserializers for schemaOrgImpl.
* schemaOrgDoma - schemaOrgImpl added [Doma](http://doma.readthedocs.io/ja/stable/) domain class use features.
* schemaOrgDomaConv - Converters for schemaOrgDoma.

