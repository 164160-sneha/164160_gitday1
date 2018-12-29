db.zipcodes.aggregate([
{$group:{_id:"$city",totalPop:{$sum:"$pop"}}},
]
)