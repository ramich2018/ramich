<?php

namespace FMT\FormationBundle\Entity;

use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\ORM\Mapping as ORM;

/**
 * Formation
 *
 * @ORM\Table(name="formation")
 * @ORM\Entity(repositoryClass="FMT\FormationBundle\Repository\FormationRepository")
 */
class Formation
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
     * @ORM\Column(name="startDate", type="string", length=255)
     */
    private $startDate;

    /**
     * @var \DateTime
     *
     * @ORM\Column(name="endDate", type="date")
     */
    private $endDate;

    /**
     * @var int
     *
     * @ORM\Column(name="price", type="integer")
     */
    private $price;

    /**
     * @var string
     *
     * @ORM\Column(name="lieu", type="string", length=255)
     */
    private $lieu;

    /**
     * @ORM\ManyToMany(targetEntity="FMT\FormationBundle\Entity\Formateur", cascade={"persist"})
     */
    private $formateur;

    /**
     * @ORM\OneToMany(targetEntity="FMT\FormationBundle\Entity\Inscription", cascade={"persist"}, mappedBy="formation")
     */
    private $inscription;


    //pour initialiser la liste des inscriptions dans formation. étant donner que dans une formation on pluisieurs inscrits
    public function __construct()
    {
        $this->inscription=new ArrayCollection();
    }



    /**
     * @ORM\OneToMany(targetEntity="FMT\FormationBundle\Entity\Specialite", cascade={"persist"}, mappedBy="formation")
     */
    private $specialite;


    //pour initialiser la liste des specialites dans formation. étant donner que dans une formation on pluisieurs specialites
    public function __construct1()
    {
        $this->specialite=new ArrayCollection();
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
     * Set startDate
     *
     * @param string $startDate
     *
     * @return Formation
     */
    public function setStartDate($startDate)
    {
        $this->startDate = $startDate;

        return $this;
    }

    /**
     * Get startDate
     *
     * @return string
     */
    public function getStartDate()
    {
        return $this->startDate;
    }

    /**
     * Set endDate
     *
     * @param \DateTime $endDate
     *
     * @return Formation
     */
    public function setEndDate($endDate)
    {
        $this->endDate = $endDate;

        return $this;
    }

    /**
     * Get endDate
     *
     * @return \DateTime
     */
    public function getEndDate()
    {
        return $this->endDate;
    }

    /**
     * Set price
     *
     * @param integer $price
     *
     * @return Formation
     */
    public function setPrice($price)
    {
        $this->price = $price;

        return $this;
    }

    /**
     * Get price
     *
     * @return integer
     */
    public function getPrice()
    {
        return $this->price;
    }

    /**
     * Set lieu
     *
     * @param string $lieu
     *
     * @return Formation
     */
    public function setLieu($lieu)
    {
        $this->lieu = $lieu;

        return $this;
    }

    /**
     * Get lieu
     *
     * @return string
     */
    public function getLieu()
    {
        return $this->lieu;
    }

    /**
     * Add formateur
     *
     * @param \FMT\FormationBundle\Entity\Formateur $formateur
     *
     * @return Formation
     */
    public function addFormateur(\FMT\FormationBundle\Entity\Formateur $formateur)
    {
        $this->formateur[] = $formateur;

        return $this;
    }

    /**
     * Remove formateur
     *
     * @param \FMT\FormationBundle\Entity\Formateur $formateur
     */
    public function removeFormateur(\FMT\FormationBundle\Entity\Formateur $formateur)
    {
        $this->formateur->removeElement($formateur);
    }

    /**
     * Get formateur
     *
     * @return \Doctrine\Common\Collections\Collection
     */
    public function getFormateur()
    {
        return $this->formateur;
    }

    /**
     * Add inscription
     *
     * @param \FMT\FormationBundle\Entity\Inscription $inscription
     *
     * @return Formation
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

    /**
     * Add specialite
     *
     * @param \FMT\FormationBundle\Entity\Specialite $specialite
     *
     * @return Formation
     */
    public function addSpecialite(\FMT\FormationBundle\Entity\Specialite $specialite)
    {
        $this->specialite[] = $specialite;

        return $this;
    }

    /**
     * Remove specialite
     *
     * @param \FMT\FormationBundle\Entity\Specialite $specialite
     */
    public function removeSpecialite(\FMT\FormationBundle\Entity\Specialite $specialite)
    {
        $this->specialite->removeElement($specialite);
    }

    /**
     * Get specialite
     *
     * @return \Doctrine\Common\Collections\Collection
     */
    public function getSpecialite()
    {
        return $this->specialite;
    }
}
