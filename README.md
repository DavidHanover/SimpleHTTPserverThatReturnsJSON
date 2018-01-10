CSC413​​ ​​Assignment​​ ​​2:​​ ​​Async​​ ​​Task
Due​​:​ ​October​ ​9th,​ ​7:10pm
Task:
Create​ ​a​ ​program​ ​with​ ​an​ ​event​ ​loop​ ​that​ ​refreshes​ ​its​ ​output​ ​on​ ​a​ ​fixed​ ​timer.​ ​In​ ​order
to​ ​accomplish​ ​a​ ​long​ ​task,​ ​create​ ​a​ ​worker​ ​thread​ ​that​ ​will​ ​handle​ ​the​ ​task,​ ​and​ ​post
progress,​ ​and​ ​result.​ ​Use​ ​a​ ​ConcurrentLinkedQueue​ ​to​ ​pass​ ​event​ ​messages.​ ​Create
an​ ​interface​ ​or​ ​abstract​ ​class​ ​Message.​ ​Create​ ​2​ ​base​ ​classes​ ​ProgressMessage​ ​and
CompletionMessage.​ ​ProgressMessage​ ​will​ ​contain​ ​a​ ​parameter​ ​for​ ​progress​ ​complete,
and​ ​CompletionMessage​ ​will​ ​have​ ​a​ ​parameter​ ​for​ ​a​ ​string​ ​result.​ ​On​ ​every​ ​update​ ​of
the​ ​event​ ​loop,​ ​the​ ​main​ ​thread​ ​will​ ​check​ ​for​ ​messages,​ ​then​ ​trigger​ ​one​ ​of​ ​two
handlers​ ​onProgress,​ ​and​ ​onComplete.​ ​onProgress​ ​updates​ ​the​ ​progress​ ​widget,
onComplete​ ​should​ ​pass​ ​a​ ​message​ ​saying​ ​“Task​ ​complete!”.​ ​After​ ​the​ ​task​ ​is
complete,​ ​the​ ​event​ ​loop​ ​can​ ​exit.
Result:
Progress​ ​bar​ ​should​ ​move​ ​and​ ​timer​ ​should​ ​continue​ ​while​ ​the​ ​long​ ​task​ ​gets​ ​completed
in​ ​the​ ​background.
Bitbucket:
Use​ ​master​ ​and​ ​develop​ ​branches.​ ​Working​ ​commits​ ​go​ ​to​ ​develop,​ ​only​ ​pull​ ​request​ ​to
master​ ​when​ ​finished.​ ​Don’t​ ​need​ ​to​ ​do​ ​feature​ ​branches​ ​yet.
Grading:
● 60%​ ​For​ ​Working​ ​Program​ ​(Demo)
● 30%​ ​Style
● 10%​ ​Docs​ ​(Turn​ ​in​ ​zip)
