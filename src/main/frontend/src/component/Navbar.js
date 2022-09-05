import { useState } from "react";
import { Link } from "react-router-dom";

export const Navbar = () => {
    const [ collapse, setCollapse ] = useState(false);

    function toggleCollapse() {
        setCollapse(prevState => !prevState)
    }

    return (
        <nav className={`navbar navbar-expand-lg navbar-dark bg-dark fixed-top`}>
            <div className={`container`}>
                <a className={`navbar-brand`} href={`/`}>Everything Under The Sun</a>
                <div id="navbarResponsive">
                    <ul className={`navbar-nav`}>
                        <a className={`nav-link dropdown-toggle`}
                           href={'/'}
                           id='navbarDropdown'
                           role='button'
                           data-bs-toggle='dropdown'
                           aria-expanded={'false'}
                           onClick={toggleCollapse}
                        >
                            Menu
                        </a>
                        <ul className={`dropdown-menu dropdown-menu-end`}
                            aria-labelledby='navbarDropdown'
                            role='menu'>
                            <li><Link to='/'
                                         className={`dropdown-item`}>Home</Link></li>
                            <li><Link to='/about'
                                         className={`dropdown-item`}>About</Link></li>
                        </ul>
                    </ul>
                </div>
            </div>
        </nav>
    )
}