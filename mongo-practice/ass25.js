db.movies.find({"year":{$lt:"2000"}&&{$gt:"2010"}}).pretty();
