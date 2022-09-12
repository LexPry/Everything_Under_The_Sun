import styles from "./About.module.css";

// TODO: Fix this page's css, I think it looks tacky
export const About = () => {


    return (
        <div className={styles.about}>
            <h1>Everything About Us</h1>
            <p>Everything under the sun strives to be as environmentally
                friendly as possible in our shipping, and technological uses.</p>
            <h3>About Our Team</h3>
            <p>Everything under the sun's team consists of just one person:</p>
            <h2 className={styles.name}>Alex Boswell</h2>
        </div>
    );
}