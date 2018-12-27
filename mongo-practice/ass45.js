db.movies.ensureIndex({synopsis:"text"})
db.movies.find({$text:{$search:"gold dragon"}}).pretty()