db.zipcodes.aggregate([
{$group:{_id:"$state",totalPop:{$sum:"$pop"}}},
{$sort:{totalPop:-1}}
]
)