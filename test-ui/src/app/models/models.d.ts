export interface Movie {
    id: number,
    title: string,
    genre: string,
    storyLine: string,
    actors: Actor[],
    ratings: Rating[],
    writer: string,
    producer: string,
    director: string
}

export interface Actor {
    id: number,
    name: string,
    roleType: string,
}

export interface Rating {
    id: number,
    rating: number
}