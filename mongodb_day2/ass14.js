db.zipcodes.aggregate([
{$match:{city:"ATLANTA"}},
{$group:{_id:"$city",totalPop:{$sum:"$pop"}}}
])