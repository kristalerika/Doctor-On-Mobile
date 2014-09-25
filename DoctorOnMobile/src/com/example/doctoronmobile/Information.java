package com.example.doctoronmobile;


import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class Information extends Activity
{
	String ParasiteDescription[] = {"Amebiasis is an infection of the intestines caused by the parasite Entamoebahistolytica."
	, "Human granulocytic anaplasmosis (HGA), previously known as human granulocytic ehrlichiosis (HGE), is a tick-associated disease caused by a species of bacteria called Anaplasmaphagocytophilum. HGA is transmistted to humans by the bite of the deer tick and western black-legged tick.People exposed to the disease agent often have difficulty being diagnosed because of the non-specific nature of the symptoms. Most experience headaches, fever, chills, myalgia, and malaise that can be confused with other infectious and non-infectious diseases. Rashes are rarely reported by people exposed to HGA."
	,"Anthrax is an infectious disease due to a bacterium called Bacillus anthracis. Infection in humans most often involves the skin, gastrointestinal tract, or lungs."
	,"Babesiosis is an infection caused by a malaria-like parasite, also called a “piroplasm,” that infects red blood cells. Babesiamicroti is believed to be the most common piroplasm infecting humans, but scientists have identified over twenty piroplasms carried by ticks. Ticks may carry only Babesia or they may be infected with both Babesia and Lyme spirochetes. People can also get babesiosis from a contaminated blood transfusion."
	
	};
	
	String ParasiteSymtoms[] = {"Most people with this infection do not have symptoms. If symptoms occur, they are seen 7 to 28 days after being exposed to the parasite." +"\n\nMild symptoms:"+ "\n•	Abdominal cramps" + "\n•	Diarrhea" +"\n\t*	Passage of 3 - 8 semiformed stools per day" +"\n\t*	Passage of soft stools with mucus and occasional blood" + "\n•	Fatigue" + "•	Excessive gas" +"\n•	Rectal pain while having a bowel movement (tenesmus)" + "\n•	Unintentional weight loss"
	,"Clinical manifestations of HGA can range from mild to life-threatening depending on the patient's age and general health.Onset of anaplasmosis generally begins within a week of a tick bite, and often includes fever, severe headaches, malaise, muscle pains, and chills. Other symptoms may include confusion, hemorrhages, and renal failure."
	,"Symptoms of anthrax differ depending on the type of anthrax.\nSymptoms of cutaneous anthrax start 1 to 7 days after exposure:\n\n•	An itchy sore develops that is similar to an insect bite. This sore may blister and form a black ulcer (sore or eschar).\n•	The sore is usually painless, but it is often surrounded by swelling.\n•	A scab often forms, and then dries and falls off within 2 weeks. Complete healing can take longer."
	,"Symptoms of babesiosis are similar to those of Lyme disease but it more often starts with a high fever and chills. As the infection progresses, patients may develop fatigue, headache, drenching sweats, muscle aches, nausea, and vomiting. Babesiosis is often so mild it is not noticed but can be life-threatening to people with no spleen, the elderly, and people with weak immune systems. Complications include very low blood pressure, liver problems, severe hemolytic anemia (a breakdown of red blood cells), and kidney failure."
	
	
};
	
	String ParasiteTreatments[] = {"Treatment depends on the severity of infection. Usually, metronidazole is given by mouth for 10 days. This is followed by paromomycin or diloxanide.If you are vomiting, you may need to medications through a vein (intravenously) until you can take them by mouth. Medicines to stop diarrhea are usually not prescribed because they can make the condition worse.After treatment, the stool should be rechecked to make sure that the infection has been cleared."
	,"According to the Center for Disease Control (CDC), people exposed to HGA should be treated with a tetracycline antibiotic (usually doxycycline) for 10 to 14 days. A longer treatment period may be needed to account for the possibility of a coinfection with Lyme disease."		
	,"Antibiotics are usually used to treat anthrax. Antibiotics that may be prescribed include penicillin, doxycycline, and ciprofloxacin.Inhalational anthrax is treated with a combination of antibiotics such as ciprofloxacin plus another medicine, which are given by IV (intravenously). Antibiotics are usually taken for 60 days by people who have been exposed to anthrax, because it can take spores that long to germinate.Cutaneous (skin) anthrax is treated with antibiotics taken by mouth, usually for 7 to 10 days. Doxycycline and ciproflaxin are most often used."
	,"Babesiosis is treated with a combination of two types of anti-parasite drugs, atovaquone (Mepron, Malarone) plus an erythromycin-type drug (azithromycin, clarithromycin, or telithromycin). Long-standing infections may need to be treated for several months, and relapses sometimes occur and must be retreated."
	
	
	};
	//**********************************************************************************************************************************
	
	String AnimalBites_Description[] = {"An animal bite can result in a break or tear in the skin, a bruise, or a puncture wound"
	,"Brucellosis is an infectious disease that occurs from contact with animals carrying Brucella bacteria"
	,"Cat scratch disease, a bacterial infection that causes swelling of the lymph nodes, usually is due to the scratch, lick, or bite of a cat — more than 90% of people who contract it had contact with cats or kittens."		
	,"Rabies is a deadly animal disease caused by a virus. It can happen in wild animals, including raccoons, skunks, bats and foxes, or in dogs, cats or farm animals. People get it from the bite of an infected animal."
	
	};
	String AnimalBites_Symtoms[] = {"Possible symptoms include: \n•	Break or major cuts in the skin with or without bleeding\n•	Bruising\n•	Crushing injuries\n•	Puncture-type wound Certain diseases can also be spread through bites from various animals. These diseases may cause flu-likesymptoms, headache, and fever."
	,"Acute brucellosis may begin with mild flu-like symptoms, or symptoms such as:\n\n•	Abdominal pain\n•	Back pain\n•	Chills\n•	Excessive sweating\n•	Fatigue\n•	Fever\n•	Headache\n•	Joint pain\n•	Loss of appetite\n•	Weakness\n•	Weight loss\nHigh fever spikes usually occur every afternoon. The name undulant fever is because the fever rises and falls in waves."	
	,"Most people with cat scratch disease remember being around a cat, but often cannot recall receiving a scratch or a bite. A blister or a small bump develops several days after the scratch or bite and may be mistaken for a bug bite. This blister or bump is called an inoculation lesion (a wound at the site where the bacteria enter the body), and it is most commonly found on the arms and hands, head, or scalp. These lesions are generally not painful. Usually within a couple of weeks of a scratch or bite, one or more lymph nodes close to the area of the inoculation lesion will swell and become tender. (Lymph nodes are round or oval-shaped organs of the immune system that are often called glands.) For example, if the inoculation lesion is on the arm, the lymph nodes in the elbow or armpit will swell."	
	,"In people, symptoms of rabies include fever, headache and fatigue, then confusion, hallucinations and paralysis. Once the symptoms begin, the disease is usually fatal. A series of shots can prevent rabies in people exposed to the virus. You need to get them right away"
	
	};
	String AnimalBites_Treatments[] = {"To treat a minor bite, first wash your hands thoroughly with soap to avoid infection. Wash hands afterwards as well. If the bite is not bleeding severely, wash the wound thoroughly with mild soap and running water for 3 to 5 minutes. Then cover the bite with antibiotic ointment and a clean dressing."
	,"Antibiotics are used to treat the infection and prevent it from coming back. Longer courses of therapy may be needed if there are complications."	
	,"Doctors usually diagnose cat scratch disease based on a child's history of exposure to a cat or kitten and a physical examination. During the exam, the doctor will look for signs of a cat scratch or bite and swollen lymph nodes. In some cases, doctors use laboratory tests to help make the diagnosis, including:\n\n•	blood tests and cultures to rule out other causes of swollen lymph nodes\n•	a blood test that is positive for cat scratch disease\n•	a microscopic examination of a removed lymph node that shows signs of cat scratch disease Most cases of cat scratch disease resolve without any treatment. Rarely, a swollen lymph node becomes so large and painful that the doctor may recommend removing fluid from the node with a needle and syringe."	
	,"•	Vaccinate your pet. Rabies vaccines are available for dogs, cats and farm animals\n•	Don't let pets roam\n•	Don't approach stray animals. Animals with rabies might be aggressive and vicious, or tired and weak"
	
	};
	
	//*********************************************************************************************************************************************
	String Brain_Description[] = {"Meningitis is a bacterial infection of the membranes covering the brain and spinal cord (meninges)."
	,"Reye syndrome is a rare illness that can affect the blood, liver, and brain of someone who has recently had a viral infection. It always follows another illness. Although it mostly affects children and teens, anyone can get it. It can develop quickly and without warning. It is most common during flu season. "
	,"Encephalitis literally means an inflammation of the brain. In most cases, this inflammation is caused by a virus. Encephalitis is a rare disease that occurs in approximately 0.5 per 100,000 individuals — most commonly in children, the elderly, and people with weakened immune systems (e.g., those with HIV/AIDS or cancer). Although several thousand cases of encephalitis (also called acute viral encephalitis or aseptic encephalitis) are reported to the Centers for Disease Control and Prevention (CDC) every year, experts suspect that many more go unreported because the symptoms can be very broad."		
	,"Fabry disease (/ˈfɑːbri/) (also known as Fabry's disease, Anderson-Fabry disease, angiokeratoma corporis diffusum, and alpha-galactosidase A deficiency) is a rare genetic lysosomal storage disease, inherited in an X-linked manner. Fabry disease can cause a wide range of systemic symptoms. It is a form of sphingolipidosis, as it involves dysfunctional metabolism of sphingolipids. The disease is named after one of its discoverers, Johannes Fabry (June 1, 1860 – June 29, 1930)."
	,"Alzheimer's disease (AD), also known in medical literature as Alzheimer disease, is the most common form of dementia. There is no cure for the disease, which worsens as it progresses, and eventually leads to death. It was first described by German psychiatrist and neuropathologist Alois Alzheimer in 1906 and was named after him. Most often, AD is diagnosed in people over 65 years of age, although the less-prevalent early-onset Alzheimer's can occur much earlier. In 2006, there were 26.6 million people worldwide with AD. Alzheimer's is predicted to affect 1 in 85 people globally by 2050."
	};
	
	String Brain_Symtoms[] = {"Viral meningitis occurs more often than bacterial meningitis, and is milder. It usually occurs in the late summer and early fall. It most often affects children and adults under age 30. Bacteria meningitis is an emergency. You will need immediate treatment in a hospital. Symptoms usually come on quickly, and may include:\n\n•	Fever and chills\n•	Mental status changes\n•	Nausea and vomiting\n•	Sensitivity to light (photophobia)\n•	Severe headache\n•	Stiff neck (meningismus)"
	,"•	Nausea and vomiting\n•	Listlessness\n•	Personality change - such as irritability, combativeness or confusion\n•	Delirium\n•	Convulsions\n•	Loss of consciousness"	
	,"Symptoms in milder cases of encephalitis usually include:\n\n•	fever\n•	headache\n•	poor appetite\n•	loss of energy\n•	a general sick feeling In more severe cases of encephalitis, a person is more likely to experience high fever and any of a number of symptoms that relate to the central nervous system, including:\n•	severe headache\n•	nausea and vomiting\n•	stiff neck\n•	confusion\n•	disorientation\n•	personality changes\n•	convulsions (seizures)\n•	problems with speech or hearing\n•	hallucinations\n•	memory loss\n•	drowsiness\n•	coma Its harder to detect some of these symptoms in infants, but important signs to look for include:\n•	vomiting\n•	a full or bulging soft spot (fontanel)\n•	crying that doesnt stop or that seems worse when an infant is picked up or handled\n•	body stiffness Because encephalitis can follow or accompany common viral illnesses, there sometimes are signs and symptoms of these illnesses beforehand. But often, the encephalitis appears without warning."		
	,"Symptoms are typically first experienced in early childhood and can be very difficult to understand; the rarity of Fabry disease to many clinicians sometimes leads to misdiagnoses. Manifestations of the disease usually increase in number and severity as an individual ages"
	,"At first, increasing forgetfulness or mild confusion may be the only symptoms of Alzheimer's disease that you notice. But over time, the disease robs you of more of your memory, especially recent memories. The rate at which symptoms worsen varies from person to person. If you have Alzheimer's, you may be the first to notice that you're having unusual difficulty remembering things and organizing your thoughts. Or you may not recognize that anything is wrong, even when changes are noticeable to your family members, close friends or co-workers."
	};
	
	
	String Brain_Treatments[] = {"Antibiotics are used to treat bacterial meningitis. The specific type depends on which bacteria is causing the infection. Antibiotics do not treat viral meningitis. Antiviral medicine may be given to those with herpes meningitis. Other treatments will include:\n•	Fluids through a vein (IV)\n•	Medicines to treat symptoms such as brain swelling, shock, and seizures"
	,"Reye syndrome can lead to a coma and brain death, so quick diagnosis and treatment are critical. Treatment focuses on preventing brain damage. There is no cure."		
	,"Some kids with very mild encephalitis can be monitored at home, but most will need care in a hospital, usually in an intensive care unit (ICU). Doctors will carefully monitor their blood pressure, heart rate, and breathing, as well as their body fluids, to prevent further swelling of the brain. Because antibiotics aren't effective against viruses, they aren't used to treat most forms of encephalitis. However, antiviral drugs can be used to treat some forms of encephalitis, especially the type caused by the herpes simplex virus. Corticosteroids may also be used in some cases to reduce brain swelling. If a child is having seizures, anticonvulsants might be given. Over-the-counter (OTC) medications, like acetaminophen, can be used to treat fever and headaches. Many people with encephalitis make a full recovery. In some cases, swelling of the brain can lead to permanent brain damage and lasting complications like learning disabilities, speech problems, memory loss, or lack of muscle control. Speech, physical, or occupational therapy may be needed in these cases. It's difficult to predict the outcome for each patient at the time the illness begins, but some types of encephalitis are known to cause more serious complications, such as Japanese encephalitis. Rarely, if the brain damage is severe, encephalitis can lead to death. Infants (younger than 1 year old) and adults over 55 are at greatest risk of death from encephalitis."		
	,"The first treatment for Fabry's disease was approved by the US FDA on April 24, 2003. Fabrazyme (agalsidase beta) was licensed to the Genzyme Corporation. It is an enzyme replacement therapy (ERT) designed to provide the enzyme the patient is missing as a result of a genetic malfunction. The drug is expensive — in 2012, Fabrazyme's annual cost was about US$200,000 per patient, which is unaffordable to many patients around the world without enough insurance. ERT is not a cure, but can allow improved metabolism and partially prevent disease progression, as well as potentially reverse some symptoms. The pharmaceutical company Shire manufactures agalsidase alpha under the brand name Replagal as a treatment for Fabry's disease, and was granted marketing approval in the EU in 2001. FDA approval was applied for the United States. However, Shire withdrew their application for approval in the United States in 2012, citing that the agency will require additional clinical trials before approval. Pain associated with Fabry disease can be partially alleviated by ERT, but pain management regimens may also include analgesics, anticonvulsants, and nonsteroidal anti-inflammatory drugs, though the latter are usually best avoided in renal disease."
	,"Alzheimer's treatment and Alzheimer's care go hand in hand. There's no cure -- yet. "
	};
	
	//***************************************************************************************************************************************************
	
	String Sex_Description[] = {"Gonorrhea is a sexually transmitted disease. It is most common in young adults. The bacteria that cause gonorrhea can infect the genital tract, mouth, or anus. You can get gonorrhea during vaginal, oral, or anal sex with an infected partner. A pregnant woman can pass it to her baby during childbirth."
	,"Chlamydia is an infection caused by the bacteria Chlamydia trachomatis. It is most commonly sexually transmitted."	
	,"Pelvic inflammatory disease (PID) is an infection and inflammation of the uterus, ovaries, and other female reproductive organs. It causes scarring in these organs. This can lead to infertility, ectopic pregnancy, pelvic pain, abscesses, and other serious problems"	
	,"Syphilis (pronounced: SIFF-ill-iss) is a sexually transmitted disease (STD) caused by a type of bacteria known as a spirochete(through a microscope, it looks like a corkscrew or spiral). It is extremely small and can live almost anywhere in the body. The spirochetes that cause syphilis can be passed from one person to another through direct contact with a syphilis sore during sexual intercourse (vaginal, anal, or oral sex). The infection can also be passed from a mother to her baby during pregnancy. You cannot catch syphilis from a towel, doorknob, or toilet seat. In its early stages, syphilis is easily treatable. However, if left untreated, it can cause serious problems — even death. So it's important to understand as much as you can about this disease"
	,"The human immunodeficiency virus (HIV) is a lentivirus (a subgroup of retrovirus) that causes the acquired immunodeficiency syndrome (AIDS), a condition in humans in which progressive failure of the immune system allows life-threatening opportunistic infections and cancers to thrive. Without treatment, average survival time after infection with HIV is estimated to be 9 to 11 years, depending on the HIV subtype. Infection with HIV occurs by the transfer of blood, semen, vaginal fluid, pre-ejaculate, or breast milk. Within these bodily fluids, HIV is present as both free virus particles and virus within infected immune cells."
	};
	
	String Sex_Symtoms[]= {"Gonorrhea does not always cause symptoms. In men, gonorrhea can cause pain when urinating and discharge from the penis. If untreated, it can cause problems with the prostate and testicles. In women, the early symptoms of gonorrhea often are mild. Later, it can cause bleeding between periods, pain when urinating, and increased discharge from the vagina. If untreated, it can lead to pelvic inflammatory disease, which causes problems with pregnancy and infertility."
	,"As many as 25% of  men with chlamydia have no symptoms. In men, chlamydia may produce symptoms similar to gonorrhea. Symptoms may include:\n\n•	Burning sensation during urination\n•	Discharge from the penis or rectum\n•	Testicular tenderness or pain\n•	Rectal discharge or pain About 70% of women with chlamydia have no symptoms. Symptoms that may occur in women include:\n•	Burning sensation during urination\n•	Painful sexual intercourse\n•	Rectal pain or discharge\n•	Symptoms of PID, salpingitis, liver inflammation similar to hepatitis\n•	Vaginal discharge"	
	,"•	Are sexually active and younger than 25\n•	Have more than one sex partner\n•	Douche Some women have no symptoms. Others have pain in the lower abdomen, fever, smelly vaginal discharge, irregular bleeding, and pain during intercourse or urination. "	
	,"Primary Syphilis In the first stage of syphilis, red, firm, painless and sometimes wet sores appear on the vagina, rectum, penis, or mouth. There is often just one sore, but there may be several. This type of sore is called a chancre (pronounced: SHANG-ker). Chancres appear on the part of the body where the spirochetes moved from one person to another. Someone with syphilis may also have swollen glands during this first stage. After a few weeks, the chancre will disappear, but the disease doesn't go away. In fact, if the infection hasn't been treated, the disease will continue to get worse. Syphilis is highly contagious during this first stage. Unfortunately, it can be easy to miss because the chancres are painless and can appear in areas that may not be easy to see, like in the mouth, under the foreskin, on the cervix, or on the anus. This means that people may not know that they are infected, and can pass the disease on to others without realizing it. Secondary Syphilis If syphilis hasnt been treated yet, the person will often break out in a rash (including the soles of the feet and palms of the hands). The infected person may also get flu-like symptoms, such as fever and achiness. This can happen weeks to months after the chancre first appears. Sometimes the rashes associated with syphilis can be very faint or look like rashes from other infections and, therefore, may not be noticed. Sores sometimes appear on the lips, mouth, throat, vagina, and anus — but many people with secondary syphilis don't have sores at all. The symptoms of this secondary stage will go away with or without treatment. But if the infection hasn't been treated, the disease can continue to progress. Syphilis is still contagious during the secondary stage."
	,"Within 2-4 weeks after HIV infection, many, but not all, people experience flu-like symptoms, often described as the worst flu ever. This is called acute retroviral syndrome (ARS) or primary HIV infection, and it’s the body natural response to the HIV infection. \nSymptoms can include:\n\n*Fever (this is the most common symptom)\n*Swollen glands\n*Sore throat\n*Rash\n*Fatigue\n*Muscle and joint aches and pains\n*Headache"
	
	};
	
	String Sex_Treatments[] ={" Treatment is with antibiotics. Treating gonorrhea is becoming more difficult because drug-resistant strains are increasing. Correct usage of latex condoms greatly reduces, but does not eliminate, the risk of catching or spreading gonorrhea."
	,"The usual treatment for chlamydia is antibiotics, including tetracyclines, azithromycin, or erythromycin. You can get chlamydia with gonorrhea or syphilis, so if you have one sexually transmitted infection you must be screened for other sexually transmitted infections as well. All sexual contacts should be screened for chlamydia. Sexual partners must be treated to prevent passing the infection back and forth. There is no significant immunityfollowing the infection and a person may become repeatedly infected. A follow-up evaluation may be done in 4 weeks to determine if the infection has been cured."		
	,"Doctors diagnose PID with a physical exam, lab tests, and imaging tests. Antibiotics can cure PID. Early treatment is important. Waiting too long increases the risk of infertility."	
	,"If you think you may have syphilis or if you have had sexual contact with someone who might have syphilis, see your doctor or gynecologist right away. It can sometimes be difficult to spot chancres. So it's important to get checked on a regular basis, especially if you have had unprotected sex and/or more than one sex partner. Depending on the stage, the doctor can make a diagnosis by examining the discharge from chancres under a special microscope or by doing a blood test to look for signs of infection. Let the doctor know the best way to reach you confidentially with any test results. Early stages of syphilis are easily cured with antibiotics. Someone who has been infected for a while will need treatment for a longer period of time. Unfortunately, damage to the body from the late stage of syphilis cannot be treated. However, even in the late stage, it is important to get treatment. This can prevent further damage to the body. Anyone with whom you've had unprotected sex also should be checked for syphilis immediately."
	,"When people discover they have HIV, they may not begin taking medications immediately. The decision to start treatment for HIV is individual and considers a person's past medical history, the length of time they've been infected with HIV, current CD4 T cell count, and current health."
	
	};
	
	//****************************************************************************************************************************************************
	
	String Skin_Description[] = {"Scabies is a common skin infestation of tiny mites called Sarcoptesscabiei. The mites burrow into the top layer of human skin to lay their eggs, causing small itchy bumps and blisters. A child with scabies may have a bumpy red rash. Sometimes, raised wavy lines appear where the mites have burrowed, especially on the inner part of the wrist or between the fingers or toes."
	,"Shingles is a skin rash caused by a viral infection of the nerves just below the skin. The virus that causes shingles is the same one that causes chickenpox. Most teens who get shingles have mild cases; it's usually only when people are older that the rash is painful. Shingles usually appears as a line of irritated skin and blisters on one side of the chest and back. It can happen anywhere on the body, though, including on the face and near the eyes."
	,"Leprosy (Hansen’s Disease), is a chronic infectious disease that primarily affects the peripheral nerves, skin, upper respiratory tract, eyes, and nasal mucosa. The disease is caused by a bacillus (rod-shaped) bacterium known as Mycobacterium leprae."
	,"An abscess (Latin: abscessus) is a collection of pus that has built up within the tissue of the body.[1] Signs and symptoms for those close to the skin include: redness, pain, warmth, and swelling that when pressed feels like it is fluid filled. The area of redness often extends beyond the swelling. Carbuncles and furuncles are types of abscess that often involves hair follicles with carbuncles being larger."
	,"An acrochordon (plural acrochorda, and also known as a (cutaneous) skin tag, or fibroepithelial polyp) is a small benign tumor that forms primarily in areas where the skin forms creases, such as the neck, armpit, and groin. They may also occur on the face, usually on the eyelids. Acrochorda are harmless, typically painless and usually do not grow or change over time. Though tags up to a half-inch long have been seen, they are typically the size of a grain of rice. The surface of an acrochordon may be smooth or irregular in appearance and is often raised from the surface of the skin on a fleshy stalk called a peduncle. Microscopically, an acrochordon consists of a fibro-vascular core, sometimes also with fat cells, covered by an unremarkable epidermis. However, tags may become irritated by shaving, clothing, jewelry or eczema."
	
	};
	
	String Skin_Symtoms[] = {"The most common symptom of scabies is severe itching, which can be worse at night or after a hot bath. A scabies infection begins as small itchy bumps, blisters, or pus-filled bumps that break when scratched. Itchy skin may become thick, scaly, scabbed, and crisscrossed with scratch marks. The itching is due to a hypersensitivity reaction to the mite and/or its feces and eggs. The areas of the body most commonly affected by scabies are the hands and feet (especially the webs of skin between the fingers and toes), the inner part of the wrists, and the folds under the arms. It may also affect other areas of the body, particularly the elbows and around the breasts, genitals, navel, and buttocks. Infants and young children can have the rash on the scalp, palms, and soles of feet. Rashes in infants and young children can look redder or have larger blisters. Scratching the itchy areas of skin can allow bacteria to get into the injured skin. Impetigo, a bacterial skin infection, may affect skin that's already infected with scabies."
	,"In many cases, the first thing someone notices with shingles is a tingling, pain, or itching in the area where the rash is going to appear. This can happen a few days before the rash, which means someone with shingles may feel itching, tingling, or pain and have no idea what's causing it. When the rash appears, it often starts as groups or lines of pimples on one side of the body or face. The pimples change to pus-filled blisters that break open and scab over in about 7 to 10 days. When the blisters are scabbed over, they begin to heal. The scabs typically heal and fall off about 2 to 4 weeks after the rash appears. Some people with shingles also may have a fever, headache, fatigue, or general achiness. In rare cases, a person can have the pain of shingles without getting a rash. Some people (usually older people) have more severe symptoms."	
	,"•	Skin lesions that are lighter than your normal skin color\n\t*	Lesions have decreased sensation to touch, heat, or pain\n\t*	Lesions do not heal after several weeks to months\n•	Muscle weakness\n•	Numbness or lack of feeling in the hands, arms, feet, and legs"
	,"The main symptoms and signs of an abscess are redness, heat, swelling, pain and loss of function. Abscesses may occur in any kind of solid tissue but most frequently on skin surface (where they may be superficial pustules (boils) or deep skin abscesses), in the lungs, brain, teeth, kidneys and tonsils. Major complications are spreading of the abscess material to adjacent or remote tissues and extensive regional tissue death (gangrene). Abscesses in most parts of the body rarely heal themselves, so prompt medical attention is indicated at the first suspicion of an abscess. An abscess could potentially be fatal (although this is rare) if it compresses vital structures such as the trachea in the context of a deep neck abscess. If superficial, abscesses may be fluctuant when palpated. This is a wave-like motion which is caused by movement of the pus inside the abscess."
	,"A skin tag at first may appear as a tiny soft bump on the skin. Over time, it grows into a flesh-colored piece of skin attached to the skin surface by a stalk. Its easy to move or wiggle a skin tag back and forth. A skin tag is painless, although it can become irritated if it is rubbed a lot. If a skin tag is twisted on its stalk, a blood clot can develop within it and the skin tag may become painful."
	
	};
	
	String Skin_Treatments[] = {"Scabies infections need to be treated by a doctor. Call the doctor or dermatologist any time your child has a skin itch or rash that will not go away, especially if the itch is worse at night and occurs around the wrists or in the webbed part of the fingers. If scabies is suspected, the doctor may scrape a small part of the affected skin and examine the scrapings under a microscope for signs of scabies mites. Doctors treat scabies by prescribing a medicated cream or lotion to kill the mites. The cream needs to be applied to skin all over the body, not just the area with the rash, and usually must stay on the skin for 8 to 12 hours before it can be washed off. In infants and young children, remember to also put the cream on the head, face, and scalp — even on the ears. If you forget these areas, you may not get rid of all the mites. Also trim your child's fingernails and scrape off any dirt that's on the fingertips, and put medicine on the fingertips as well. After applying the cream, don't wash your own hands — scabies mites love the area between the fingers! You may want to apply the medication before your child goes to bed, then wash it off in the morning. Most often, the treatment needs to be repeated in 1-2 weeks, especially if you see live mites on the skin 2 weeks after treatment. Sometimes the doctor may choose an oral medication instead of topical lotion to treat scabies in older children. Since scabies is highly contagious and can cause re-infestations, other members of your household also should be treated, even if they have no symptoms. Because scabies can be sexually transmitted, sexually active teens with scabies should be examined for other sexually transmitted diseases (STDs) too. Any sexual partners also should be treated for scabies. The doctor might prescribe antibiotics if your child also develops a bacterial skin infection (such as impetigo) and an antihistamine to help relieve the itching. Once a child begins treatment for scabies, it usually takes about 1 to 2 days for the itching to stop. In some cases, though, itching can last for a few weeks. If your child has itching that's severe, the doctor may prescribe a steroid cream for the skin, like hydrocortisone. Steroid cream should only be used if recommended by your doctor because it can make certain infections worse. If the treatment is effective, there should be no new rashes or burrows after 24 to 48 hours."
	,"Antiviral medications can make a shingles flare-up heal faster and reduce the chances of having complications. Not everyone needs to take antiviral medicines, though — your doctor will prescribe them if necessary. If you do need to take them, the earlier you start, the more effective they will be. Antiviral medicines cant eliminate the virus from the body completely, so they won't stop someone from having future flare-ups. To ease any pain that might come with shingles, doctors or nurse practitioners may prescribe a cream, spray, or skin patch to numb the skin. Some prescription and over-the-counter medications also can help treat pain. Don't take aspirin, though. It can put teens at risk of a rare but serious illness called Reye syndrome. If you have shingles that itch, your doctor may recommend lotions or medicines called antihistamines. Keep the rash area clean by washing with water and a mild soap. Apply cool, wet compresses to the blisters several times a day to reduce the pain and itching. Oatmeal baths also can bring relief."	
	,"A number of different antibiotics (including dapsone, rifampin, clofazamine, fluoroquinolones, macrolides, and minocycline) are used to kill the bacteria that cause the disease. More than one antibiotic is often given together. Aspirin, prednisone, or thalidomide is used to control inflammation."		
	,"The standard treatment for an uncomplicated skin or soft tissue abscess is opening and draining. There does not appear to be any benefit from also using antibiotics in most cases. A small amount of evidence did not find benefit from packing the abscess with gauze."
	,"Because tags are benign, treatment is unnecessary unless the tags become frequently irritated or present a cosmetic concern. If removal is desired or warranted, then a dermatologist, general practitioner or a similarly trained professional may use cauterization, cryosurgery, excision, or surgical ligation to remove the acrochorda."
	
	};
	
	EditText InfoTXT;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState)
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.information);
	        
	        InfoTXT = (EditText) findViewById(R.id.Information_TXT);
	        
	        if(getIntent().getExtras().getString("Main_Category").equals("Parasite"))
	        {
	        	InfoTXT.setText("Description : \n\n" + ParasiteDescription[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nSymptoms:\n\n " + ParasiteSymtoms[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nTreatments:\n\n " + ParasiteTreatments[getIntent().getExtras().getInt("index")] + "\n\n");
	        }
	        else if(getIntent().getExtras().getString("Main_Category").equals("Animal Bites"))
	        {
	        	InfoTXT.setText("Description : \n\n" + AnimalBites_Description[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nSymptoms:\n\n " + AnimalBites_Symtoms[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nTreatments:\n\n " + AnimalBites_Treatments[getIntent().getExtras().getInt("index")] + "\n\n");
	        }
	        else if(getIntent().getExtras().getString("Main_Category").equals("Brain or Spinal"))
	        {
	        	InfoTXT.setText("Description : \n\n" + Brain_Description[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nSymptoms:\n\n " + Brain_Symtoms[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nTreatments:\n\n " + Brain_Treatments[getIntent().getExtras().getInt("index")] + "\n\n");
	        }
	        else if(getIntent().getExtras().getString("Main_Category").equals("Sexually Transmitting Diseases"))
	        {
	        	InfoTXT.setText("Description : \n\n" + Sex_Description[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nSymptoms:\n\n " + Sex_Symtoms[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nTreatments:\n\n " + Sex_Treatments[getIntent().getExtras().getInt("index")] + "\n\n");
	        }
	        else if(getIntent().getExtras().getString("Main_Category").equals("Skin Diseases"))
	        {
	        	InfoTXT.setText("Description : \n\n" + Skin_Description[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nSymptoms:\n\n " + Skin_Symtoms[getIntent().getExtras().getInt("index")] + "\n\n");
	        	InfoTXT.setText(InfoTXT.getText() + "\n\nTreatments:\n\n " + Skin_Treatments[getIntent().getExtras().getInt("index")] + "\n\n");
	        }
	    }
}