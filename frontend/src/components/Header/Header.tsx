import './Header.css'
export const Header = () => {
    return (
        <div className="navbar">
            <div className="header-left">
                <p className="title-link">VenueNavi</p>
            </div>
            <div className="header-right">
                <p className="upcoming-link">Upcoming</p>
                <p className="search-link">Search</p>
            </div>
        </div>
    )
}