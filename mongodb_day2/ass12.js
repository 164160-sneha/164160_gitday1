db.zipcodes.aggregate([
{$match:{city:"ATLANTA"}},
{$group:{_id:"$Atlanta",myCount:{$sum:1}}}
])