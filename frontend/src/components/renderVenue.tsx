import { useEffect, useState} from 'react'
import restaurants from '../restaurants'

function renderVenue() {
    const [restaurantArray, setRestaurantArray] = useState([{
        name: "",
        address: "",
        cuisine: "",
        price: "",
        rating: ""
    }])
    useEffect(() => {
        setRestaurantArray(restaurants)
    }, [])

    return (
        <>
            {restaurantArray.map((item, index) => (
                <div key={index}>
                    <h1>{item.name}</h1>
                    <p>{item.price}</p>
                </div>
            ))}
        </>
    )
}
export default renderVenue