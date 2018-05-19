<?php

namespace FMT\FormationBundle\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * Formateur
 *
 * @ORM\Table(name="formateur")
 * @ORM\Entity(repositoryClass="FMT\FormationBundle\Repository\FormateurRepository")
 */
class Formateur
{
    /**
     * @var int
     *
     * @ORM\Column(name="id", type="integer")
     * @ORM\Id
     * @ORM\GeneratedValue(strategy="AUTO")
     */
    private $id;

    /**
     * @var string
     *
     * @ORM\Column(name="matiere", type="string", length=255)
     */
    private $matiere;

    /**
     * @var string
     *
     * @ORM\Column(name="titre", type="string", length=255)
     */
    private $titre;

    /**
     * @ORM\OneToOne(targetEntity="FMT\FormationBundle\Entity\User", cascade={"persist"})
     */
    private $user;






    /**
     * Get id
     *
     * @return integer
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Set matiere
     *
     * @param string $matiere
     *
     * @return Formateur
     */
    public function setMatiere($matiere)
    {
        $this->matiere = $matiere;

        return $this;
    }

    /**
     * Get matiere
     *
     * @return string
     */
    public function getMatiere()
    {
        return $this->matiere;
    }

    /**
     * Set titre
     *
     * @param string $titre
     *
     * @return Formateur
     */
    public function setTitre($titre)
    {
        $this->titre = $titre;

        return $this;
    }

    /**
     * Get titre
     *
     * @return string
     */
    public function getTitre()
    {
        return $this->titre;
    }

    /**
     * Set user
     *
     * @param \FMT\FormationBundle\Entity\User $user
     *
     * @return Formateur
     */
    public function setUser(\FMT\FormationBundle\Entity\User $user = null)
    {
        $this->user = $user;

        return $this;
    }

    /**
     * Get user
     *
     * @return \FMT\FormationBundle\Entity\User
     */
    public function getUser()
    {
        return $this->user;
    }
}
