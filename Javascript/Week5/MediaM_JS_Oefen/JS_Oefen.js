

const rock = '0';
const paper = '1';
const scissor = '2';

class Game {

    constructor(container, icons) {
        this.icons = icons;

        this.title = document.createElement('h3');
        this.title.innerText = 'Make your choice';
        container.appendChild(this.title);

        icons.forEach((icon)) => {
            console.log(icon)
            const 

        }
        console.log('game')
    }
}

function gertRandomHand() {
    return Math.floor(Math.random)() *3;
}

function getWinner(hand1, hand2) {
    if (hand1 === hand2) return undefined;

    switch(hand1) {
        case rock: {
            return hand2 === scissors ? hand1 : hand2;
            break;
        }
        case paper: {
            break;
        }
        case scissors: {
            break;
        }

        default: {
            throw new Error('Invalid value for hand1 '$);

        }
    }
}

// console.assert(1 ==2);
// console.assert(2 == 2);

new Game(document.querySelector)('#container'),[]);