Created Simple Project how Bean scopes works.

There are 5 types of Scopes.

1.Singleton scope 

2.Prototype scope

3.Request Scope

4.Session Scope

5.Application Scope.(rarely used)

Singleton scope:
-----------------
*Default scope.

*Creates one object per IOC.

*Eagarly Initialsed.

*Syntax : @Scope("singleton")

Prototype Scope:
------------------
*Each time creates new object.

*Lazily Initialized.

*Syntax : @Scope("prototype")

Request Scope
------------------
*New Object will be created for each http request.

*Lazily Initialzed.

*Syntax : @Scope("request")

Session Scope
------------------
*New Object will be created for each Session.

*Lazily Initailized.

*When user access the endpoint , the session will be created.

*Remains active , till it does not expire.

*Syntax : @Scope("session")

