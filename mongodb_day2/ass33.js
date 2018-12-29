db.zipcodes.aggregate([
{$group:{_id:"$city",totalPop:{$sum:"$pop"}}},
{$sort:{totalPop:-1}},
{$limit:3}
]
)