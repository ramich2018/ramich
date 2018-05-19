<?php

namespace FMT\FormationBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;

class DefaultController extends Controller
{
    public function indexAction()
    {
        return $this->render('default/index.html.twig');
    }

    public function index2Action()
    {
        return $this->render('default/indexTextBlock1.html.twig');
    }


}
