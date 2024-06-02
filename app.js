
class Comparable {
    constructor(points) {
        // this.user = user;
        this.points = points; 
    }

    compare(otherUser) {
        return this.points == otherUser.points;
    }
}


let user1 = new Comparable(34);
let user2 = new Comparable(34);

result = user1.compare(user2);
console.log(result);