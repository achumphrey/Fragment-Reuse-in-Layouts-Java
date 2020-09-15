package com.example.fragmentreuseinlayoutsjava;

public class Descriptions {

    private String name;
    private String desc;
    private int image;

    public Descriptions(String name, String desc, int image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }

    static final Descriptions[] DESCRIPTIONS_ARRAY = {
            new Descriptions("The Persian cat", "The Persian cat is a long-haired breed of" +
                    " cat characterized by its round face" +
                    "and short muzzle. It is also known as" +
                    "the \"Persian Longhair\" in the English-speaking countries." +
                    " The first documented ancestors of the Persian were imported" +
                    " into Italy from Iran (historically known as Persia in the west) around 1620." +
                    " Recognized by the cat fancy since the late 19th century," +
                    " it was developed first by the English, and then mainly by " +
                    "American breeders after the Second World War. Some cat fancier" +
                    " organizations' breed standards subsume the Himalayan and Exotic " +
                    "Shorthair as variants of this breed, while others treat them " +
                    "as separate breeds.", R.drawable.persiancat),
            new Descriptions("The Siamese cat", "The Siamese cat is one of the first distinctly" +
                    "recognized breeds of Asian cat. Derived from the Wichianmat" +
                    "landrace, one of several varieties of cat native to Thailand " +
                    "(formerly known as Siam), the original Siamese became one of the" +
                    "most popular breeds in Europe and North America in the 19th century." +
                    "The carefully refined, more extreme-featured, modern-style Siamese" +
                    "is characterized by blue almond-shaped eyes; a triangular head shape;" +
                    "large ears; an elongated, slender, and muscular body; and various" +
                    "forms of point colouration. Other than colouration, the modern-style " +
                    "Siamese bears little resemblance to the original stock, and the more" +
                    "moderate, traditional, or \"old-style\" Siamese, with a much rounder" +
                    "head and body, has been re-established by multiple registries as the" +
                    "Thai cat. The International Cat Association describes the modern" +
                    "Siamese as affectionate, social, intelligent, and playful into " +
                    "adulthood, often enjoying a game of fetch.[1] Siamese tend to " +
                    "seek human interaction and also like companionship from other cats.",
                    R.drawable.siamesecat),
            new Descriptions("The Bengal cat", "The Bengal cat is a domesticated cat" +
                    "breed created from hybrids of domestic cats, especially the spotted" +
                    "Egyptian Mau, with the Asian leopard cat (Prionailurus bengalensis)." +
                    "The breed name comes from the leopard cat's taxonomic name.\n" +
                    "\n" + "Bengals have a wild appearance; their golden shimmer comes " +
                    "from their Leopard Cat ancestry, and their coats may show spots," +
                    "rosettes, arrowhead markings, or marbling. They are an energetic" +
                    "breed which needs much exercise and play.",
                    R.drawable.bengalcat),
            new Descriptions("The British Shorthair Cat", "The British Shorthair is " +
                    "the pedigreed version of the traditional British domestic cat, with" +
                    "a distinctively stocky body, dense coat, and broad face. The most familiar " +
                    "color variant is the \"British Blue,\" a solid grey-blue coat, orange eyes," +
                    "and a medium-sized tail. The breed has also been developed in a wide range of " +
                    "other colours and patterns, including tabby and colorpoint.\n" +
                    "\n" +
                    "It is one of the most ancient cat breeds known. In modern times, it remains" +
                    "the most popular pedigreed breed in its native country, as registered by the " +
                    "UK's Governing Council of the Cat Fancy (GCCF).\n" +
                    "\n" + "The breed's good-natured appearance and relatively calm temperament" +
                    "make it a frequent media star, notably as the inspiration for " +
                    "John Tenniel's famous illustration of the Cheshire Cat from Alice in Wonderland." +
                    "The Cat Fanciers' Association profile reads: \"When gracelessness is observed, " +
                    "the British Shorthair is duly embarrassed, quickly recovering with a " +
                    "'Cheshire cat smile'.\"",
                    R.drawable.britishshorthaircat),
    };
}
