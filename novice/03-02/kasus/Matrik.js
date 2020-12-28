m1 = [[1,2],[4,5]]
m2 = [[2,3],[5,6]]
m3 =[[],[]]
//console.log(m1[0][0])
for (let index = 0; index < 2; index++) {
    for (let index2 = 0; index2 < 2; index2++) {
       //console.log(m1[index][index2]+m2[index][index2])
       m3[index][index2]=(m1[index][index2]+m2[index][index2])
    }
    
}
console.table(m1)
console.table(m2)
console.table(m3);