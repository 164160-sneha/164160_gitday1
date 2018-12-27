db.movies.ensureIndex({synopsis:"text"})
db.movies.find({$text:{$search:"Gandalf"}}).pretty()