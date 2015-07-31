bookstore_dtd.dtd :-
-kept written_by and published_by attributes required for book element
-kept wrote attribute required for author element
-kept published attribute required for publisher element


data_dtd.xml :-
-<!DOCTYPE bookstore SYSTEM "bookstore_dtd.dtd">
implies that this xml has to be validated with bookstore_dtd.dtd
and root element of this xml is bookstore


------------------------------------------------------------------------


bookstore_schema.xsd :-
-in schema element, xmlns:xsd="http://www.w3.org/2001/XMLSchema"
implies that the elements and data types used in the schema come from the "http://www.w3.org/2001/XMLSchema" namespace


data_schema.xml :-
-in bookstore element, xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
tells the XML parser that this document should be validated against a schema
-in bookstore element, xsi:noNamespaceSchemaLocation="bookstore_schema.xsd"
specifies WHERE the schema resides (here it is in the same folder as "data_schema.xml")
