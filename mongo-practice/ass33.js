db.movies.update({"title":"Pulp Fiction"},{$set:{"actors":"Samuel L. Jackson"}})
db.movies.find().pretty();