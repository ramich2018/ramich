<?php

namespace FMT\FormationBundle\Entity;

use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\ORM\Mapping as ORM;

/**
 * Etudiant
 *
 * @ORM\Table(name="etudiant")
 * @ORM\Entity(repositoryClass="FMT\FormationBundle\Repository\EtudiantRepository")
 */
class Etudiant
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
     * @ORM\Column(name="niveau", type="string", length=255)
     */
    private $niveau;

    /**
     * @var string
     *
     * @ORM\Column(name="lieuEtude", type="string", length=255)
     */
    private $lieuEtude;

    /**
     * @var string
     *
     * @ORM\Column(name="filiere", type="string", length=255)
     */
    private $filiere;

    /**
     * @ORM\OneToOne(targetEntity="FMT\FormationBundle\Entity\User", cascade={"persist"})
     */
    private $user;

    /**
     * @ORM\OneToMany(targetEntity="FMT\FormationBundle\Entity\Inscription", cascade={"persist"}, mappedBy="etudiant")
     */
    private $inscription;

//pour initialiser la liste des inscriptions d'un étudiant
    public function __construct()
    {
        $this->inscription=new ArrayCollection();
    }





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
     * Set niveau
     *
     * @param string $niveau
     *
     * @return Etudiant
     */
    public function setNiveau($niveau)
    {
        $this->niveau = $niveau;

        return $this;
    }

    /**
     * Get niveau
     *
     * @return string
     */
    public function getNiveau()
    {
        return $this->niveau;
    }

    /**
     * Set lieuEtude
     *
     * @param string $lieuEtude
     *
     * @return Etudiant
     */
    public function setLieuEtude($lieuEtude)
    {
        $this->lieuEtude = $lieuEtude;

        return $this;
    }

    /**
     * Get lieuEtude
     *
     * @return string
     */
    public function getLieuEtude()
    {
        return $this->lieuEtude;
    }

    /**
     * Set filiere
     *
     * @param string $filiere
     *
     * @return Etudiant
     */
    public function setFiliere($filiere)
    {
        $this->filiere = $filiere;

        return $this;
    }

    /**
     * Get filiere
     *
     * @return string
     */
    public function getFiliere()
    {
        return $this->filiere;
    }

    /**
     * Set user
     *
     * @param \FMT\FormationBundle\Entity\User $user
     *
     * @return Etudiant
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

    /**
     * Add inscription
     *
     * @param \FMT\FormationBundle\Entity\Inscription $inscription
     *
     * @return Etudiant
     */
    public function addInscription(\FMT\FormationBundle\Entity\Inscription $inscription)
    {
        $this->inscription[] = $inscription;

        return $this;
    }

    /**
     * Remove inscription
     *
     * @param \FMT\FormationBundle\Entity\Inscription $inscription
     */
    public function removeInscription(\FMT\FormationBundle\Entity\Inscription $inscription)
    {
        $this->inscription->removeElement($inscription);
    }

    /**
     * Get inscription
     *
     * @return \Doctrine\Common\Collections\Collection
     */
    public function getInscription()
    {
        return $this->inscription;
    }
}
