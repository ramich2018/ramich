<?php

namespace FMT\FormationBundle\Entity;

use Doctrine\ORM\Mapping as ORM;

/**
 * Inscription
 *
 * @ORM\Table(name="inscription")
 * @ORM\Entity(repositoryClass="FMT\FormationBundle\Repository\InscriptionRepository")
 */
class Inscription
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
     * @var \DateTime
     *
     * @ORM\Column(name="dateInscription", type="datetime")
     */
    private $dateInscription;

    /**
     * @ORM\ManyToOne(targetEntity="FMT\FormationBundle\Entity\Etudiant", inversedBy="inscription")
     */
    private $etudiant;

    /**
     * @ORM\ManyToOne(targetEntity="FMT\FormationBundle\Entity\Formation", inversedBy="inscription")
     */
    private $formation;






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
     * Set dateInscription
     *
     * @param \DateTime $dateInscription
     *
     * @return Inscription
     */
    public function setDateInscription($dateInscription)
    {
        $this->dateInscription = $dateInscription;

        return $this;
    }

    /**
     * Get dateInscription
     *
     * @return \DateTime
     */
    public function getDateInscription()
    {
        return $this->dateInscription;
    }

    /**
     * Set etudiant
     *
     * @param \FMT\FormationBundle\Entity\Etudiant $etudiant
     *
     * @return Inscription
     */
    public function setEtudiant(\FMT\FormationBundle\Entity\Etudiant $etudiant = null)
    {
        $this->etudiant = $etudiant;

        return $this;
    }

    /**
     * Get etudiant
     *
     * @return \FMT\FormationBundle\Entity\Etudiant
     */
    public function getEtudiant()
    {
        return $this->etudiant;
    }

    /**
     * Set formation
     *
     * @param \FMT\FormationBundle\Entity\Formation $formation
     *
     * @return Inscription
     */
    public function setFormation(\FMT\FormationBundle\Entity\Formation $formation = null)
    {
        $this->formation = $formation;

        return $this;
    }

    /**
     * Get formation
     *
     * @return \FMT\FormationBundle\Entity\Formation
     */
    public function getFormation()
    {
        return $this->formation;
    }
}
