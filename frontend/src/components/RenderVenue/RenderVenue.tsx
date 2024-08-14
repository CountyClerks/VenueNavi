import { useEffect, useState} from 'react'
import venues from '../../venues'

export const renderVenue = () => {
    const [venueArray, setVenueArray] = useState([{
        name: "",
        address: "",
        rating: "",
        website: "",
        photo: ""
    }])
    useEffect(() => {
        setVenueArray(venues)
    }, [])

    return (
        <>
            {venueArray.map((item, index) => (
                <div key={index}>
                    <h1>{item.name}</h1>
                    <p>{item.address}</p>
                    <p>{item.rating}</p>
                    <p>{item.website}</p>
                    <p>{item.photo}</p>
                </div>
            ))}
        </>
    )
}