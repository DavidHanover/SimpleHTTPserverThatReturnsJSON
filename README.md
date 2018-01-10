CSC413​​ ​​Assignment​​ ​​1:​​ ​​Simple​​ ​​Rest​​ ​​API
Due​​:​ ​September​ ​20th,​ ​7:10pm
Task:
Create​ ​a​ ​simple​ ​REST​ ​API​ ​Backend​ ​that​ ​parses​ ​the​ ​requested​ ​resource,​ ​and​ ​routes​ ​it​ ​to
the​ ​appropriate​ ​method,​ ​and​ ​returns​ ​a​ ​response.​ ​Your​ ​responses​ ​will​ ​be​ ​in​ ​the​ ​JSON
data​ ​format.​ ​Requests​ ​will​ ​use​ ​the​ ​GET​ ​Http​ ​method,​ ​and​ ​respond​ ​with
“application/json”​ ​in​ ​the​ ​header.​ ​Use​ ​the​ ​Google​ ​GSON​ ​library​ ​to​ ​interact​ ​with​ ​JSON
Architecture​​:
Use​ ​the​ ​​Singleton​​ ​​​​pattern​ ​to​ ​encapsulate​ ​the​ ​server​ ​object.​ ​Place​ ​all​ ​the​ ​running​ ​logic
in​ ​a​ ​method​ ​named​ ​run.​ ​Use​ ​the​ ​​Builder​​​ ​pattern​ ​to​ ​generate​ ​your​ ​responses.​ ​Avoid
iterating​ ​through​ ​lists​ ​for​ ​the​ ​filters,​ ​instead​ ​create​ ​maps​ ​on​ ​load.
Endpoints:
● User
○ Behavior:
■ Returns​ ​all​ ​users
● posts
○ Behavior:
■ Returns​ ​all​ ​posts
● Posts
○ Params
■ userid
○ Behavior:
■ Returns​ ​all​ ​posts​ ​by​ ​a​ ​user
● posts
○ Params:
■ Userid
○ Behavior:
■ Returns​ ​all​ ​posts​ ​by​ ​a​ ​user
● comments
○ Params:
■ Postid
○ Behavior:
■ Returns​ ​all​ ​comments​ ​on​ ​a​ ​specific​ ​post
Parameters:
Parameters​ ​follow​ ​the​ ​endpoint​ ​after​ ​the​ ​question​ ​mark.​ ​Arguments​ ​are​ ​split​ ​up​ ​by​ ​the​ ​&
sign.
/<endpoint>​?​​param1=something&param2=something
Responses:
Create​ ​a​ ​response​ ​class​ ​that​ ​contains​ ​the​ ​fields​ ​​status​​,​ ​​timestamp​​,​ ​​entries​​,​ ​and​ ​​data.
Status​ ​should​ ​show​ ​either​ ​OK,​ ​or​ ​a​ ​descriptive​ ​error.​ ​Timestamp​ ​is​ ​the​ ​time​ ​the
response​ ​was​ ​generated.​ ​Data​ ​is​ ​an​ ​array​ ​of​ ​objects.​ ​Entries​ ​is​ ​the​ ​count​ ​of​ ​entries.​ ​A
response​ ​should​ ​look​ ​something​ ​like​ ​this:
{
"status":​ ​"OK",
"timestamp":​ ​"<Current​ ​time​ ​here>",
"entries"​ ​:​ ​2,
"data"​ ​:​ ​[
{
"postid":0,
"userid":​ ​1,
"data":​ ​"I​ ​lost​ ​my​ ​lightsaber,​ ​anyone​ ​seen​ ​it?"
},
{
"postid":1,
"userid":​ ​0,
"data":​ ​"Found​ ​lightsaber,​ ​looking​ ​for​ ​owner"
}
]
}
Bitbucket:
Use​ ​master​ ​and​ ​develop​ ​branches.​ ​Working​ ​commits​ ​go​ ​to​ ​develop,​ ​only​ ​pull​ ​request​ ​to
master​ ​when​ ​finished.​ ​Don’t​ ​need​ ​to​ ​do​ ​feature​ ​branches​ ​yet.
Grading:
● 60%​ ​For​ ​Working​ ​Program​ ​(Demo)
● 30%​ ​Style
● 10%​ ​Docs​ ​(Turn​ ​in​ ​zip)
