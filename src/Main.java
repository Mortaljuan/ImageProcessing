public class Main {
    public static void main(String[] args) {
        //Cargar imagen y convertirla en un array 2D
        int[][] imageData = ImageProcessing.imgToTwoD("./apple.jpg");

        //Creacion de imagenes
        int[][] trimmed = ImageProcessing.trimBorders(imageData, 60);
        //imagen con colores invertidos
        int[][] negative = ImageProcessing.negativeColor(imageData);
        //imagen alargada horizontalmente
        int[][] elongated = ImageProcessing.stretchHorizontally(imageData);
        //imagen disminuida verticalmente
        int[][] shrink = ImageProcessing.shrinkVertically(imageData);
        //imagen invertida
        int[][] inverted = ImageProcessing.invertImage(imageData);
        //imagen con filtro de colores
        int[][] filtered =ImageProcessing.colorFilter(imageData,70,-30,140);

        //tamaño del lienzo vacio
        int[][] canvas = new int[500][500];

        //pintar de manera  random
        int[][] random =    ImageProcessing.paintRandomImage(canvas);

        int [] rgba = {0,255,255,255};
        int blueColor = ImageProcessing.getColorIntValFromRGBA(rgba);

        int[][] color = ImageProcessing.paintRectangle(canvas,200,45,12,14,blueColor);

        canvas = ImageProcessing.generateRectangles(canvas,500);


        //Guardado de imagenes generadas(en orden)
        ImageProcessing.twoDToImage(trimmed, "./trimmed_apple.jpg");
        ImageProcessing.twoDToImage(negative,"./negative_apple.jpg");
        ImageProcessing.twoDToImage(elongated,"./elongated_apple.jpg");
        ImageProcessing.twoDToImage(shrink,"./shrink_apple.jpg");
        ImageProcessing.twoDToImage(inverted,"./inverted_apple.jpg");
        ImageProcessing.twoDToImage(filtered,"./filtered_apple.jpg");
        ImageProcessing.twoDToImage(random,"./random_image.jpg");
        ImageProcessing.twoDToImage(canvas,"./rectangle_image.jpg");
        ImageProcessing.twoDToImage(canvas,"./abstract_art.jpg");
        ImageProcessing.twoDToImage(ImageProcessing.generateRectangles(new int[400][400],500),"./abstract_art.jpg");
    }
}