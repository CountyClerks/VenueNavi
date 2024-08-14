// import React from 'react';
import { FaSearch } from 'react-icons/fa'
import { IconContext } from 'react-icons'
import './SearchBar.css'

export const SearchBar = () => {
    return (
        <IconContext.Provider value={{color: "grey", className: "Fa-Search"}}>
            <div className="input-wrapper">
                <FaSearch id="search-icon"/>
                <input placeholder="Search for Artist, Venue or Event" className="search-input"/>
            </div>
        </IconContext.Provider>
    )
}